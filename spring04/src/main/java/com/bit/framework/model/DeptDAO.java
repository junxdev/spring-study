package com.bit.framework.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.model.entity.DeptVO;

public interface DeptDAO {
	List<DeptVO> selectAll() throws SQLException;
	DeptVO selectOne(int key) throws SQLException;
	void insertOne(DeptVO vo) throws SQLException;
	int updateOne(DeptVO vo) throws SQLException;
	int deleteOne(int key) throws SQLException;
}
