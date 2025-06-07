package com.cloudeguru.method_overloading;

public class MethodOverloading1 {
	
	public int add(int a, int b, int c) {
		System.out.println("Method with 3 args");
		return a+b+c;
	}
	
	public int add(int a, int b) {
		System.out.println("Method with 2 args");
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading1 obj = new MethodOverloading1();
		int result1 = obj.add(10,20,30);
		System.out.println("3 args result "+result1);
		int result2 = obj.add(10,20);
		System.out.println("2 args result "+result2);

	}
}
