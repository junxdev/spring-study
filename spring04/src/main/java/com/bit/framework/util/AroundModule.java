package com.bit.framework.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundModule implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before");
		Object method = null;
		try {
			method = invocation.proceed();
		} catch (Exception e) {
			System.out.println("throws");
		}
		System.out.println("after");
		return method;
	}

}
