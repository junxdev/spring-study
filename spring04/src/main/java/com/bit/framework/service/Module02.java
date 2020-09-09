package com.bit.framework.service;

public class Module02 {
	
//	ConsoleService console = new KorConsoleService();
	ConsoleService console;
	
	public Module02() {
	}
	
	//DI; Dependency Injection
	public Module02(ConsoleService console) {
		super();
		this.console = console;
	}
	
	public void setConsole(ConsoleService console) {
		this.console = console;
	}
	
	public void func01() {
		console.hello();
	}
	
	public void func02() {
		String[] arr = new String[] {"a", "b"};
		for(int i = 0; i < 3; i++) {
			console.goodBye();
//			String x = arr[i];
		}
	}
	
}
