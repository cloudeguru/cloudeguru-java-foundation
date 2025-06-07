package com.cloudeguru.loops;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i =0 ; i < 5; i++) {
			if(i == 2) {
				System.out.println("Value "
						+ "of i is 2, skipping");
				continue;
			}
			System.out.println(i);
		}

	}
}
