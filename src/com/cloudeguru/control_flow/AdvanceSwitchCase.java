package com.cloudeguru.control_flow;

public class AdvanceSwitchCase {

	public static void main(String[] args) {
		String day = "MONDAY";
		
		String result = switch(day) {
		case "MONDAY", "TUESDAY" -> "Start of the week";
		case "SATURDAY", "SUNDAY" -> "Weekend";
		default -> "Mid week";
		};
		
		System.out.println("We are in :: "+result);

	}

}
