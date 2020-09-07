package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDAO;

public class DetailController implements Controller {

	EmpDAO dao;
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo", dao.selectOne(Integer.parseInt(request.getParameter("idx"))));
		mv.setViewName("emp/detail");
		return mv;
	}

}
