package com.bit.framework.dept.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.dept.model.entity.DeptVO;

public class DeptDAOImpl extends JdbcDaoSupport implements DeptDAO {

	RowMapper rowMapper = new RowMapper<DeptVO>() {
		@Override
		public DeptVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptVO(
					rs.getInt("deptno"), 
					rs.getString("dname"), 
					rs.getString("loc"));
		}
	};
	
	@Override
	public List<DeptVO> selectAll() throws SQLException {
		String sql = "SELECT * FROM dept";
		return getJdbcTemplate().query(sql, rowMapper);
	}

	@Override
	public void insertOne(DeptVO vo) {
		String sql = "INSERT INTO dept (dname, loc) VALUES (?, ?)";
		getJdbcTemplate().update(sql, new Object[] {vo.getDname(), vo.getLoc()});
	}

	@Override
	public DeptVO selectOne(int key) {
		String sql = "SELECT * FROM dept WHERE deptno = ?";
		return getJdbcTemplate().queryForObject(sql, new Object[] {key}, rowMapper);
	}

	@Override
	public int updateOne(DeptVO vo) {
		String sql = "UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?";
		return getJdbcTemplate().update(sql, new Object[] {vo.getDname(), vo.getLoc(), vo.getDeptno()});
	}

	@Override
	public int deleteOne(int key) {
		String sql = "DELETE FROM dept WHERE deptno = ?";
		return getJdbcTemplate().update(sql, new Object[] {key});
	}

}
