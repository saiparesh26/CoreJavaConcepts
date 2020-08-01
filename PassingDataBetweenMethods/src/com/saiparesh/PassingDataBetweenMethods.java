package com.saiparesh;

public class PassingDataBetweenMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4;
		System.out.println("number = "+number);
		newNumber(5);
		System.out.println("number = " + number);
		
		StringBuilder sb = new StringBuilder();
		build(sb);
		System.out.println("string builder = " + sb);
	}
	
	public static void newNumber(int number) {
		number = 10;
	}
	
	public static void build(StringBuilder s) {
		s.append("Tom"); //Will act as a pass by reference when we are using methods.
	}
}