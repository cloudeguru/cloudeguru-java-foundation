package com.cloudeguru.packages;

public class PackageTest {

	public static void main(String[] args) {
		Student internal= new Student();
		System.out.println(internal.type);
		com.cloudeguru.packages_test.Student external
		= new com.cloudeguru.packages_test.Student();
		System.out.println(external.type);
	}
}
