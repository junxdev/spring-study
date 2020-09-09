package com.bit.framework.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.framework.model.entity.DeptVO;

public class DeptDAOImpl01 implements DeptDAO {
	JdbcTemplate jdbcTemplate;
	RowMapper<DeptVO> rowMapper = new RowMapper<DeptVO>() {
		
		public DeptVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptVO(rs.getInt("deptno"), 
					rs.getString("dname"), 
					rs.getString("loc"));
		}
	};
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<DeptVO> selectAll() throws SQLException {
		String sql = "SELECT * FROM dept";
		return jdbcTemplate.query(sql, rowMapper);
	}

	public DeptVO selectOne(int key) throws SQLException {
		String sql = "SELECT * FROM dept WHERE deptno = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {key}, rowMapper);
	}

	public void insertOne(DeptVO vo) throws SQLException {
		String sql = "INSERT INTO dept (dname, loc) VALUES (?, ?)";
		jdbcTemplate.update(sql, vo.getDname(), vo.getLoc());
	}

	public int updateOne(DeptVO vo) throws SQLException {
		String sql = "UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?";
		return jdbcTemplate.update(sql, vo.getDname(), vo.getLoc(), vo.getDeptno());
	}

	public int deleteOne(int key) throws SQLException {
		String sql = "DELETE FROM dept WHERE deptno = ?";
		return jdbcTemplate.update(sql, key);
	}

}
