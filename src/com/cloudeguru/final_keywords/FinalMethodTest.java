package com.cloudeguru.final_keywords;

public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A {
	
	public final void method() {
		System.out.println("Class A method");
	}
}

class B extends A{
	//Cannot override the final method from A
	@Override
	public  void method() {
		System.out.println("Class A method");
	}
}
