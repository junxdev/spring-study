package com.bit.framework.dept.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.dept.model.entity.DeptVO;
import com.ibatis.sqlmap.client.SqlMapClient;

public class DeptDAOImpl2 implements DeptDAO {
	
	SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public List<DeptVO> selectAll() throws SQLException {
		return sqlMapClient.queryForList("selectAll");
	}

	@Override
	public void insertOne(DeptVO vo) throws SQLException {
		sqlMapClient.insert("insertOne", vo);
	}

	@Override
	public DeptVO selectOne(int key) throws SQLException {
		return (DeptVO) sqlMapClient.queryForObject("selectOne", key);
	}

	@Override
	public int updateOne(DeptVO vo) throws SQLException {
		return sqlMapClient.update("updateOne", vo);
	}

	@Override
	public int deleteOne(int key) throws SQLException {
		return sqlMapClient.delete("deleteOne", key);
	}

}
