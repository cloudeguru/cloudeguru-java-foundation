package com.cloudeguru.constructors;

public class Teacher {
	
	String name;
	int age;
	
	//No-Argument Constructor
	public Teacher() {
		this.name = "No name yet";
		this.age = 0;
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println("Default name:"+t.name);
		System.out.println("Default age:"+t.age);
	}
}
