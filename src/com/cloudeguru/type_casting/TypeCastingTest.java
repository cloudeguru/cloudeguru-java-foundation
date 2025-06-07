package com.cloudeguru.type_casting;

public class TypeCastingTest {

	public static void main(String[] args) {
		//Type casting -- widening- narrowing
		// byte -> short -> int -> long -> float-> double
		byte b = 10;
		short s = b; // widening
	
		System.out.println("byte "+b);
		System.out.println("short "+s);
		int i = s;
		System.out.println("int "+i);
		long l = i;
		System.out.println("long "+l);
		float f = l;
		System.out.println("float "+f);
		double d = f;
		System.out.println("double "+f);
		
		double d1 = 10.212132;
		System.out.println("double d1 "+d1);
		int i1 = (int)d1;// narrowing-- side effect -- data loss
		System.out.println("int i1 "+i1);
	}

}
