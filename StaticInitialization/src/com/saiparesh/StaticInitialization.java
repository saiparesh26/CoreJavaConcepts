package com.saiparesh;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {
	
	private static final int SIZE;
	private static int one;
	private static final int two;
	private static final int three = 3;
	
	private static final List<String> Names = new ArrayList<>();
//	private static final int four;
	
	static {
		System.out.println("First Static");
		int rows = 5;
		int column = 4;
		SIZE = rows * column;
	}
	
	static {
		System.out.println("Second Static");
		one = 1;
		two = 2;
		one = three;
	}
	
	static {
		System.out.println("third static");
		Names.add("Jimmy");
		Names.add("Timmy");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Names);
		
	}

}
