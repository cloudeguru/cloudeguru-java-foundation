package com.cloudeguru.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = {90, 85, 78, 99, 100};
		System.out.println("Element at 0th index "+scores[0]);//90
		System.out.println("Element at 3rd index "+scores[3]);//99
		int marks[] = new int[5];
		//initializes with 0 value for all indexes
		marks[0]=50;
		marks[3]=40;
		System.out.println("Mark at 2nd index "+marks[2]);//0
		double heights[] = new double[3];
		////initializes with 0.0 value for all indexes
		System.out.println("Height at 0th index "+heights[0]);//0.0
	}

}
