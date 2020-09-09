package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.Controller;
import org.w3c.dom.views.AbstractView;

import com.bit.framework.dept.model.DeptDAO;
import com.bit.framework.dept.model.entity.DeptVO;

public class UpdateController extends AbstractCommandController {

	DeptDAO dao;
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		dao.updateOne((DeptVO) command);
		return new ModelAndView("redirect:list.bit");
	}

}
