package com.cloudeguru.method_overloading;

public class Method_Overloading9 {
	
	public static void main() {
		System.out.println("Overloaded main method with no-args");
	}

	public static void main(String[] args) {
		System.out.println("Program execution starts from here");
		main();
	}
}
