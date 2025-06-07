package com.cloudeguru.static_keyword;

public class Student2 {

	private static String COLLEGE = "XYZ";

	private String name;

	public Student2(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println(Student2.COLLEGE);
	}
}
