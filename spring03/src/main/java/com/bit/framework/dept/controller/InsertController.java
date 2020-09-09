package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.bit.framework.dept.model.DeptDAO;
import com.bit.framework.dept.model.DeptDAOImpl;
import com.bit.framework.dept.model.entity.DeptVO;

public class InsertController extends AbstractCommandController {
	
	Logger log = Logger.getLogger(this.getClass());
	DeptDAO dao;
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {
		DeptVO vo = (DeptVO)command;
		if(vo.getDname() == null) {
			ObjectError error = new ObjectError("No dname", "Please fill in the department's name");
			errors.addError(error );
		} else if(vo.getDname().isEmpty()) {
			ObjectError error = new ObjectError("No dname", "Please fill in the department's name");
			errors.addError(error );
		}
		if(vo.getLoc() == null) {
			ObjectError error = new ObjectError("No loc", "Please fill in where the department is located");
			errors.addError(error );
		} else if(vo.getLoc().isEmpty()) {
			ObjectError error = new ObjectError("No loc", "Please fill in where the department is located");
			errors.addError(error );
		}
		log.debug(command);
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
//		String dname = request.getParameter("dname");
//		String loc = request.getParameter("loc");
//		log.debug("dname : " + dname + ", loc : " + loc);
		String path = "redirect:/dept/list.bit";
		if(errors.hasErrors()) {
			path = "dept/add";
		} else {
//			dao.insertOne((DeptVO)command);
			log.debug(command);
		}
		ModelAndView mv = new ModelAndView(path);
		return mv;
	}

}
