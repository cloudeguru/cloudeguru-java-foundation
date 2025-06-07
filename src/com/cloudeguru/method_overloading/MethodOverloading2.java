package com.cloudeguru.method_overloading;

public class MethodOverloading2 {
	
	public int add(int a, int b) {
		System.out.println("Method with int args");
		return a+b;
	}
	
	public float add(float a, float b) {
		System.out.println("Method with float args");
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();
		int result1 = obj.add(10,20);
		System.out.println("int args result "+result1);
		float result2 = obj.add(10.2f,20.3f);
		System.out.println("float args result "+result2);

	}
}
