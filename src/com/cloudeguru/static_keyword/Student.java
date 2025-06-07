package com.cloudeguru.static_keyword;

public class Student {
	
	private static String COLLEGE = "XYZ";
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Rahul");
		Student s2 = new Student("Rajat");
		System.out.println(s1.name);
		System.out.println(s1.COLLEGE);
		System.out.println(s2.name);
		System.out.println(s2.COLLEGE);
	}
}
