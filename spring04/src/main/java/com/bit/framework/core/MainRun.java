package com.bit.framework.core;

import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.framework.model.entity.DeptVO;
import com.bit.framework.service.ConsoleService;
import com.bit.framework.service.DeptService;
import com.bit.framework.service.KorConsoleService;
import com.bit.framework.service.Module01;
import com.bit.framework.service.Module02;
import com.bit.framework.service.Module03;

public class MainRun {

	 public static void main(String[] args) throws SQLException {
		 
//		System.out.println("Hello World!");
//		
		 // IoC; Inversion of Control
////		Module01 module = new Module01();
//		Module02 module = new Module02();
//		module.setConsole(new KorConsoleService()); 
//		module.func01();
//		module.func02();
		 
		 ApplicationContext ac = null;
		 ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
//		 ac = new FileSystemXmlApplicationContext("C:\\Users\\User\\Documents\\spring-study\\spring04\\src\\main\\resources\\applicationContext.xml");
//		 ac = new FileSystemXmlApplicationContext("src\\main\\resources\\applicationContext.xml");
//		 ac = new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		 
//		 Module02 module = (Module02) ac.getBean("module02");
//		 module.func01();
//		 module.func02();
		 
//		 Module03 module = (Module03) ac.getBean("module03");
//		 System.out.println(module);
//		 module.showList();
//		 module.showSet();
//		 module.showMap();
//		 System.out.println(Arrays.toString(module.getObj()));
		 
		 // AOP;Aspect Oriented Programming
//		 Module02 module = (Module02) ac.getBean("proxyBean");
//		 module.func01();
//		 module.func02();
		 
		 DeptService deptService = (DeptService) ac.getBean("deptService");
		 deptService.insert(new DeptVO(1, "감리", "원주"));
		 for(DeptVO vo : deptService.list()) System.out.println(vo);
//		 System.out.println(deptService.detail(1));
//		 System.out.println(deptService.insert(new DeptVO(1, "법무", "성남")));
	}
}
