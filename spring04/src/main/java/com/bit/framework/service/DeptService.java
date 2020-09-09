package com.bit.framework.service;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.model.entity.DeptVO;

public interface DeptService {

	List<DeptVO> list() throws SQLException;
	DeptVO detail(int key) throws SQLException;
	void insert(DeptVO vo) throws SQLException;
	void update(DeptVO vo) throws SQLException;
	void delete(DeptVO vo) throws SQLException;
}
