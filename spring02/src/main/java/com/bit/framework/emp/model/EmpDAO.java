package com.bit.framework.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.emp.model.entity.EmpVO;

public class EmpDAO extends JdbcDaoSupport {
	
//	private DataSource dataSource;
	
//	private String driver;
//	private String url = "jdbc:mysql://localhost:3306/xe";
//	private String url;
//	private String user = "scott";
//	private String password = "tiger";
	
//	public EmpDAO() {
//		System.out.println("Connected");
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public EmpDAO(String driver, String url, String user, String password) {
//		this.url = url;
//		this.user = user;
//		this.password = password;
//		System.out.println("Connected");
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	public EmpDAO() {
	}
	
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	
//	public void setDriver(String driver) {
//		this.driver = driver;
//	}
//	
//	public void setUrl(String url) {
//		this.url = url;
//	}
	
	public List<EmpVO> selectAll() throws SQLException {
		String sql = "SELECT * FROM emp";
		return getJdbcTemplate().query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EmpVO(rs.getInt("empno"), 
						rs.getString("ename"), 
						rs.getString("job"), 
						rs.getInt("pay"), 
						rs.getTimestamp("hiredate"));
			}
			
		});
		/*List<EmpVO> list = new ArrayList<>();
		try(
//				Connection conn = DriverManager.getConnection(url, user, password);
//				Connection conn = dataSource.getConnection();
				Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				) {
			while(rs.next()) {
				list.add(new EmpVO(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), rs.getInt("pay"), rs.getTimestamp("hiredate")));
			}
		}
		return list;*/
	}

	public void insertOne(String ename, String job, int pay) throws SQLException {
		String sql = "INSERT INTO emp (ename, job, pay, hiredate) VALUES (?, ?, ?, NOW())";
		Object[] params = new Object[] {ename, job, pay};
		getJdbcTemplate().update(sql, params);
		/*try(
//				Connection conn = DriverManager.getConnection(url, user, password);
//				Connection conn = dataSource.getConnection();
				Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				) {
			ps.setString(1, ename);
			ps.setString(2, job);
			ps.setInt(3, pay);
			ps.executeUpdate();
		}*/
	}

	public Object selectOne(int parseInt) throws SQLException {
		String sql = "SELECT * FROM emp WHERE empno = ?";
		return getJdbcTemplate().queryForObject(sql, new Object[] {parseInt}, new RowMapper<EmpVO>() {

			@Override
			public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EmpVO(rs.getInt("empno"), 
						rs.getString("ename"), 
						rs.getString("job"), 
						rs.getInt("pay"), 
						rs.getTimestamp("hiredate"));
			}
		});
		/*try(
//				Connection conn = DriverManager.getConnection(url, user, password);
//				Connection conn = dataSource.getConnection();
				Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				) {
			ps.setInt(1, parseInt);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new EmpVO(rs.getInt("empno"), 
						rs.getString("ename"), 
						rs.getString("job"), 
						rs.getInt("pay"), 
						rs.getTimestamp("hiredate"));
			}
		}
		return null;*/
	}

	public int updateOne(int empno, String ename, String job, int pay) throws SQLException {
		String sql = "UPDATE emp SET ename = ?, job = ?, pay = ? WHERE empno = ?";
		return getJdbcTemplate().update(sql, new Object[] {ename, job, pay, empno});
		/*try(
//				Connection conn = DriverManager.getConnection(url, user, password);
//				Connection conn = dataSource.getConnection();
				Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				) {
			ps.setString(1, ename);
			ps.setString(2, job);
			ps.setInt(3, pay);
			ps.setInt(4, empno);
			return ps.executeUpdate();
		}*/
	}
	
	public int deleteOne(int empno) {
		String sql = "DELETE FROM emp WHERE empno = ?";
		return getJdbcTemplate().update(sql, new Object[] {empno});
	}
}
