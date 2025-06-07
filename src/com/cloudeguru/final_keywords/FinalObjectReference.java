package com.cloudeguru.final_keywords;

import java.util.ArrayList;
import java.util.List;

public class FinalObjectReference {

	public static void main(String[] args) {
		final List<String> list = new ArrayList<>();
		list.add("A");
		///The final local variable list cannot be assigned. 
		///It must be blank and not using a compound assignment
		list = new ArrayList<>();

	}

}
