package com.cloudeguru.arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		//int[][] matrix = new int[3][2];
		
		int[][] matrix  = {   
				{1, 2},
			    {3, 4},
			    {5, 6}
			    };

		System.out.println(matrix[0][1]);//2
		System.out.println(matrix[2][0]);//5
	}
}
