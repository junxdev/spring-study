package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.dept.model.DeptDAO;
import com.bit.framework.dept.model.DeptDAOImpl;

public class ListController implements Controller {

	DeptDAO dao;
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dept/list");
		mv.addObject("list", dao.selectAll());
//		System.out.println(dao);
//		System.out.println(dao.selectAll());
		return mv;
	}

}
