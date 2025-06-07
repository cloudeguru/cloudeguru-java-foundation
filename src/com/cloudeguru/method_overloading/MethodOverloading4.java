package com.cloudeguru.method_overloading;

public class MethodOverloading4 {
	
	public int add(int a, int b) {
		System.out.println("Method with int return type");
		return a+b;
	}
	
	public float add(int a, int b) {
		System.out.println("Method with 2 args");
		return (float)a+b;
	}

	public static void main(String[] args) {
		MethodOverloading4 obj = new MethodOverloading4();
		int result1 = obj.add(10,20);
		System.out.println("int return type result "+result1);
		float result2 = obj.add(10,20);
		System.out.println("float return type result "+result2);

	}
}
