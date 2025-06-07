package com.cloudeguru.method_overloading;

public class Method_Overloading8 {
	
	public void print(int i) {
		System.out.println("Exact match");
	}
	
	public void print(long i) {
		System.out.println("type promotion match");
	}

	public static void main(String[] args) {
		Method_Overloading8 obj = new Method_Overloading8();
		obj.print(10);
	}
}
