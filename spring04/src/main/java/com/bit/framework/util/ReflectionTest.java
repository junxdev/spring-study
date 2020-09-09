package com.bit.framework.util;

public class ReflectionTest {
	static enum E { A, B };
	static Class c = "foo".getClass();
	public static void main(String[] args) {
		Class e = E.A.getClass();
		System.out.println(c);
		System.out.println(e);
	}
}
