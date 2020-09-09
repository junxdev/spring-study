package com.bit.framework.util;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterModule02 implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("after module02 " + method.getName() + " goes : " + returnValue);
	}

}
