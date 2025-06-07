package com.cloudeguru.arithmetic_operators;

public class ArithmeticOperators {
	
	
	public int add (int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int subtraction (int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int multi (int x, int y) {
		int z = x * y;
		return z;
	}
	
	public int division (int x, int y) {
		int z = x / y;
		return z;
	}
	
	public int modulus (int x, int y) {
		int z = x % y;
		return z;
	}

	public static void main(String[] args) {
		ArithmeticOperators obj = new ArithmeticOperators();
		int r1 = obj.add(100, 500);
		System.out.println("Add result "+r1);
		int r2 = obj.subtraction(300, 500);
		System.out.println("Subtraction result "+r2);
		
		int r3 = obj.multi(10, 5);
		System.out.println("Multiplication result "+r3);
		
		int r4 = obj.division(11, 5);
		System.out.println("Division result "+r4);
		
		int r5 = obj.modulus(11, 5);
		System.out.println("Reminder");
		System.out.println(r5);

	}

}
