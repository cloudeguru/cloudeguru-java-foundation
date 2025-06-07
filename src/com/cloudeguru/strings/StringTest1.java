package com.cloudeguru.strings;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "Hi";
		System.out.println(s1);//Hi
		s1.concat(" Hello");
		System.out.println(s1);//Hi
		s1= s1.concat(" Hello");
		System.out.println(s1);//Hi Hello
	}
}
