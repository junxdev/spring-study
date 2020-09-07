package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDAO;

public class DeleteController implements Controller {

	EmpDAO dao;
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		dao.deleteOne(Integer.parseInt(request.getParameter("idx")));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:list.bit");
		return mv;
	}

}
