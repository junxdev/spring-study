package com.bit.framework.util;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowModule implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("module2 exception happened");
	}
}
