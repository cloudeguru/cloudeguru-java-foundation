package com.cloudeguru.access_modifiers;

public class Y {

	public static void main(String[] args) {
		X a = new X("Rahul", 20);
		//public access visible everywhere
		System.out.println("Age::"+a.age);
		//default access visible classes inside same package
		System.out.println("Name::"+a.name);	

	}
}
