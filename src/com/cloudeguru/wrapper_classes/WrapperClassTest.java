package com.cloudeguru.wrapper_classes;

public class WrapperClassTest {

	public static void main(String[] args) {
		// byte, short, int, long, float , double -- primitive data types
		// Java -- Object Oriented Language
		// List-- ArrayList, LinkedList -- Object
		// primitive -- Object
		
		int i = 10;
		// Wrapper class // Integer -- int
		
		//Integer intObj = Integer.valueOf(i);
		
		Integer intObj = i;
		//Automatic conversion of primitive type to wrapper type/object type is called Autoboxing
		
		byte b = 20;
		
		//Byte byteObj = Byte.valueOf(b);
		Byte byteObj =b;
		
		short s = 25;
		
		Short shortObj = Short.valueOf(s);
		
		// Wrapper -> Primitive
		Integer intObj1 = 100;
		
		int i2 = intObj1.intValue();
		//System.out.println(i2);
		
		//Wrapper type
		Float fObj = 10.2f;
		//float f = fObj.floatValue();
		float f = fObj;// Automatic conversion of wrapper/object to primitive is called Unboxing
		//System.out.println(f);
		
		int i3 = 10;
		
		Integer intObj2 = 100;
		
		long l = intObj2; 
		System.out.println(l);
		
		
		
		
		

	}

}
