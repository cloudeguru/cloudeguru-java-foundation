package com.cloudeguru.constructors;

public class ConstructorOverloading {

	public static void main(String[] args) {
		 Player p1 = new Player();
         Player p2 = new Player("Rahul", 25);
	}

}

class Player{
	
	String name;
	int age;
	
	public Player() {
		System.out.println("Default Constructor");
	}
	
    public Player(String name, int age) {
    	System.out.println("Parameterized Constructor");
		this.name = name;
		this.age = age;
	}
}
