package com.cloudeguru.access_modifiers;

public class Q {

	public static void main(String[] args) {
		P a = new P("Rahul", 20);
		//public access visible everywhere
		System.out.println("Age::"+a.age);
		//Protected access visible classes 
		//inside same package
		System.out.println("Name::"+a.name);	
	}
}
