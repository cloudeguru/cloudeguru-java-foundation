package com.cloudeguru.access_modifiers_test;

import com.cloudeguru.access_modifiers.P;

public class R extends P{
	
	public R(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		R r = new R("Rahul", 20);
		//public access visible everywhere
		System.out.println("Age::"+r.age);
		//protected visible outside package 
		//but in subclass only
		System.out.println("Name::"+r.name);	
	}
}
