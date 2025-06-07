package com.cloudeguru.method_overloading;

public class Method_Overloading6 {
	
	public void print(short i) {
		System.out.println("type demotion match");
	}
	
	public void print(Integer i) {
		System.out.println("Autoboxing match");
	}

	public static void main(String[] args) {
		Method_Overloading6 obj = new Method_Overloading6();
		obj.print(10);
	}
}
