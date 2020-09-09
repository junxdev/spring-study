package com.bit.framework.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bit.framework.model.entity.DeptVO;

public class DeptDAOImpl02 implements DeptDAO {

	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transactionManager;
	private RowMapper<DeptVO> rowMapper = new RowMapper<DeptVO>() {

		public DeptVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return new DeptVO(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
	};
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	public List<DeptVO> selectAll() throws SQLException {
		final String sql = "SELECT * FROM dept ORDER BY deptno desc";
		PreparedStatementCreator psc = null;
		psc = new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				return con.prepareStatement(sql);
			}
		};
		return jdbcTemplate.query(psc, rowMapper);
	}

	public DeptVO selectOne(final int key) throws SQLException {
		final String sql = "SELECT * FROM dept WHERE deptno = ?";
		PreparedStatementCreator psc = null;
		psc = new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, key);
				return ps;
			}
		};
		return jdbcTemplate.query(psc, rowMapper).get(0);
	}

	public void insertOne(final DeptVO vo) throws SQLException {
		final String sql1 = "INSERT INTO dept (dname, loc) VALUES (?, ?)";
		final String sql2 = "INSERT INTO dept (dname, loc) VALUES1 (?, ?)";
		
		TransactionStatus status = null;
		PreparedStatementCreator psc = null;
		TransactionDefinition definition = null;
		definition = new DefaultTransactionDefinition();
		status = transactionManager.getTransaction(definition);
		try {
			psc = new PreparedStatementCreator() {
				
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					System.out.println(con);
					PreparedStatement ps = con.prepareStatement(sql1);
					ps.setString(1, vo.getDname());
					ps.setString(2, vo.getLoc());
					return ps;
				}
			};
			jdbcTemplate.update(psc);
			psc = new PreparedStatementCreator() {
				
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					System.out.println(con);
					PreparedStatement ps = con.prepareStatement(sql2);
					ps.setString(1, vo.getDname());
					ps.setString(2, vo.getLoc());
					return ps;
				}
			};
			jdbcTemplate.update(psc);
			transactionManager.commit(status);
		} catch (Exception e) {
			transactionManager.rollback(status);
		}
	}

	public int updateOne(DeptVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteOne(int key) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
