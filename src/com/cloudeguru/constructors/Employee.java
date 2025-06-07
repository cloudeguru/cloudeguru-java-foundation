package com.cloudeguru.constructors;

public class Employee {
	
	String name;
	int age;
	//parameterized constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		//Employee e1 = new Employee();
		Employee e2 = new Employee("Rahul", 25);
	}

}
