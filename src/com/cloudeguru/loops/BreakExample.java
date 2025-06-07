package com.cloudeguru.loops;

public class BreakExample {

	public static void main(String[] args) {
		for (int i =0 ; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("Value "
						+ "of i is 5, stopping the loop");
				break;
			}
		}

	}

}
