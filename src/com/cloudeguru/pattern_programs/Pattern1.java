package com.cloudeguru.pattern_programs;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 1 ; i <= 5; i ++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		for (int i = 5; i >= 1; i--) {
//			System.out.println("Line "+i);
//		}

	}
}
