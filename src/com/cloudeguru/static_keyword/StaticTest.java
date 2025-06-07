package com.cloudeguru.static_keyword;

public class StaticTest {

	private static int a1 = 10;
	private static int a2 = 10;
	private int a3;
	
	public StaticTest() {
		this.a3=10;
	}

	public static void add() {
		System.out.println("Adding static variables");
		System.out.println(a1 + a2);
	}
	
	public static void add2() {
		System.out.println("Adding static and non-static"
				+ " variables");
		//Cannot make a static reference to the non-static field a3
		System.out.println(a1 + a3);
	}

	public static void main(String[] args) {
		add();
	}
}
