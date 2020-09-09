package com.bit.framework.dept.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.framework.dept.model.entity.DeptVO;

public interface DeptDAO {

	List<DeptVO> selectAll() throws SQLException;
	void insertOne(DeptVO vo) throws SQLException;
	DeptVO selectOne(int key) throws SQLException;
	int updateOne(DeptVO vo) throws SQLException;
	int deleteOne(int key) throws SQLException;
}
