package com.cloudeguru.pattern_programs;

public class ReversePyramid {

	public static void main(String[] args) {
		//number of rows/layers in pyramid
		int n = 5;
		//Outer loop for number of layers
		for(int i =n ; i >=1 ; i--) {
			
			//inner loop to print spaces
			for(int j =1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			//inner loop to print spaces
			for(int j =1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			
			//Move to next line
			System.out.println();
		}

	}
}
