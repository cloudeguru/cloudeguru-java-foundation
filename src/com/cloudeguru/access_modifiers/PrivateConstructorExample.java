package com.cloudeguru.access_modifiers;

public class PrivateConstructorExample {
	
	private PrivateConstructorExample() {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {
		PrivateConstructorExample obj = new
				PrivateConstructorExample();
	}

}
