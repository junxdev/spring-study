package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDAO;

public class UpdateController implements Controller {

	EmpDAO dao;
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		int pay = Integer.parseInt(request.getParameter("pay"));
		dao.updateOne(empno, ename, job, pay);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:detail.bit?idx=" + empno);
		return mv;
	}

}
