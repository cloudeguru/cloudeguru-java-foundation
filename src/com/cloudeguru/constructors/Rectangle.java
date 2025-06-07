package com.cloudeguru.constructors;

public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle() {
        this(1.0, 1.0);  // Calls the two-parameter constructor
        System.out.println("In no-args constructor");
    }
    
    public Rectangle(double side) {
        this(side, side); // Creates a square
        System.out.println("In 1 args constructor");
    }
    
    public Rectangle(double width, double height) {
    	System.out.println("In 2 args constructor");
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
    	Rectangle r = new Rectangle();
	}
}
