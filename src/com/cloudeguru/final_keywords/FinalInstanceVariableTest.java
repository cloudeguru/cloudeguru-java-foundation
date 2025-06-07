package com.cloudeguru.final_keywords;

public class FinalInstanceVariableTest {
	
	private final int age;
	
	public FinalInstanceVariableTest() {
		this.age = 20;
	}
	
	public void change() {
		this.age = 30;
	}

	public static void main(String[] args) {

	}

}
