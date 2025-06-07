package com.cloudeguru.static_keyword;

public class StaticBlockTest {

	private static String NAME;

	static {
		NAME = "RAHUL";
		System.out.println("Static block is executed");
	}

	public static void main(String[] args) {
		System.out.println("Main method is executed");
	}
}
