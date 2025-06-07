package com.cloudeguru.control_flow;

public class IfElseClauseTest {

	public static void main(String[] args) {
        System.out.println("***Program execution starts***");
		
		int myAge = 21;
		
		if(myAge > 18) {
			System.out.println("Eligible to cast vote");
		}else {
			System.out.println("Not Eligible to cast vote");
		}
		
		if(myAge > 25) {
			System.out.println("Eligible to appear as candidate");
		}else {
			System.out.println("Not Eligible to appear as candidate");
		}
		
		System.out.println("***Program execution ends***");

	}

}
