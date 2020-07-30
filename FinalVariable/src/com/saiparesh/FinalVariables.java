package com.saiparesh;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

	public static final int SIZE = 0;
	
	public static final List<String> VALUES = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[SIZE];
		
//		SIZE++; 
		VALUES.add("Changed"); //Methods allowed
//		VALUES = new ArrayList<>(); Not allowed to point to other
	}

}
