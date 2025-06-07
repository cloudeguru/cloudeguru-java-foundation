package com.cloudeguru.control_flow;

public class IfElseIfCluaseTest {

	public static void main(String[] args) {
		
		System.out.println("***Program execution starts***");
		
		int mark = 62;
		
		if(mark >= 90) {
			System.out.println("Grade O::Outstanding");
		}else if(mark >= 80 && mark < 90) {
			System.out.println("Grade E::Excellent");
		}else if(mark >= 70 && mark < 80) {
			System.out.println("Grade A");
		}else {
			System.out.println("Grade P:: Pass");	
		}
		System.out.println("***Program execution ends***");

	}

}
