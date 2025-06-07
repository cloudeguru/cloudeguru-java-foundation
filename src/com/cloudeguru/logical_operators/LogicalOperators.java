package com.cloudeguru.logical_operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// AND && true && true -- true 
		// OR || false || false -- false
		
		int a = 10;
		int b = 5;
		int c = 10;
		
		boolean flag = false;
		
		System.out.println( a > b && b > c);// true && false // false
		System.out.println( a > b || b > c);// true || false // true
		System.out.println( a < b || b > c); //false || false // false
		
		System.out.println(!flag);//true

	}

}
