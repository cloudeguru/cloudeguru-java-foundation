package com.cloudeguru.method_overloading;

public class MethodOverloading3 {
	
	public float add(int a, float b) {
		System.out.println("Method with int-float args");
		return a+b;
	}
	
	public float add(float a, int b) {
		System.out.println("Method with float-int args");
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading3 obj = new MethodOverloading3();
		float result1 = obj.add(10,20.2f);
		System.out.println("int-float args result "+result1);
		float result2 = obj.add(10.2f,20);
		System.out.println("float-int args result "+result2);

	}
}
