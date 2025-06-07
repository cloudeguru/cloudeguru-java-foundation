package com.cloudeguru.access_modifiers_test;

import com.cloudeguru.access_modifiers.X;

public class Z {

	public static void main(String[] args) {
		X a = new X("Rahul", 20);
		//public access visible everywhere
		System.out.println("Age::"+a.age);
		//default access not visible classes outside package
		//Compilation Error: The field X.name is not visible
		System.out.println("Name::"+a.name);	
	}
}
