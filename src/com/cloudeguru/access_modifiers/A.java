package com.cloudeguru.access_modifiers;

public class A {
	
	private String name;
	
	public int age;
	
	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class B{
	
	public static void main(String[] args) {
		A a = new A("Rahul", 20);
		System.out.println("Age::"+a.age);
		//Compilation Error: The field A.name is not visible
		System.out.println("Name::"+a.name);			
	}
}
