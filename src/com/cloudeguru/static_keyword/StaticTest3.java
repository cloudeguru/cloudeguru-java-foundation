package com.cloudeguru.static_keyword;

public class StaticTest3 {
	
	private int age;
	
	public static void method() {
		//Cannot use this in a static context
		this.age = 20;
	}

	public static void main(String[] args) {
		method();
	}
}
