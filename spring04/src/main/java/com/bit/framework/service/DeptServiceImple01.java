package com.bit.framework.service;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.model.DeptDAO;
import com.bit.framework.model.entity.DeptVO;

public class DeptServiceImple01 implements DeptService {

	DeptDAO deptDAO;
	
	public void setDeptDAO(DeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}
	
	public List<DeptVO> list() throws SQLException {
		return deptDAO.selectAll();
	}

	public DeptVO detail(int key) throws SQLException {
		return deptDAO.selectOne(key);
	}

	public void insert(DeptVO vo) throws SQLException {
		deptDAO.insertOne(vo);
	}

	public void update(DeptVO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void delete(DeptVO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
