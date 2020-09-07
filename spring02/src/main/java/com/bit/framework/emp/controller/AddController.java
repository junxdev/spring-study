package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDAO;

public class AddController implements Controller {
	EmpDAO dao;
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
//		EmpDAO dao = new EmpDAO();
		if("GET".equals(request.getMethod())) {
			mv.setViewName("emp/add");
		} else {
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			int pay = Integer.parseInt(request.getParameter("pay"));
			dao.insertOne(ename, job, pay);
			mv.setViewName("redirect:list.bit");
		}
		return mv;
	}

}
