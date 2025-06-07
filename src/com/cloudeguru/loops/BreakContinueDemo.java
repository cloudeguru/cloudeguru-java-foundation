package com.cloudeguru.loops;

public class BreakContinueDemo {

	public static void main(String[] args) {
//		int[] arr = {9,3,5,7,2,8,1,6,4};
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if (arr[i] == 5) {
//				System.out.println("found 5 at index "+i);
//				break;
//			}
//		}
		
		int[] arr2 = {2,4,6,8,0,10,12,0,14};
		           // 0,1,2,3,4,5, 6, 7,8
		
		for(int i =0 ; i < arr2.length; i++) {
			int e = arr2[i];
			if(e == 0) {
				continue;
			}
			System.out.println(e);
		}
	}

}
