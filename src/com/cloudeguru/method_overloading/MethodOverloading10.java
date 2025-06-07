package com.cloudeguru.method_overloading;

public class MethodOverloading10 {
	
	public int add(int a, int b) {
		System.out.println("Method with int return type");
		return a+b;
	}
	
	private int add(int a, int b) {
		System.out.println("Method with 2 args");
		return (float)a+b;
	}

	public static void main(String[] args) {
		MethodOverloading10 obj = new MethodOverloading10();
		int result1 = obj.add(10,20);
		System.out.println("public result "+result1);
		int result2 = obj.add(10,20);
		System.out.println("private result "+result2);

	}
}
