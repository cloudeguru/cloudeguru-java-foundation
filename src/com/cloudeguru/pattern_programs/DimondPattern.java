package com.cloudeguru.pattern_programs;

public class DimondPattern {

	public static void main(String[] args) {
		int n = 5;
		// top half
		for (int i = 1; i <= n; i++) {
			// inner loop to print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print spaces
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			// Move to next line
			System.out.println();
		}
		// bottom half
		for (int i = n - 1; i >= 1; i--) {
			// inner loop to print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print spaces
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			// Move to next line
			System.out.println();
		}
	}
}
