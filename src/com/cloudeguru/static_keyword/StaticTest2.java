package com.cloudeguru.static_keyword;

public class StaticTest2 {
	
	public static void method() {
		//Illegal modifier for parameter x; only final is permitted
		static int x= 10;
	}

	public static void main(String[] args) {
		method();
	}
}
