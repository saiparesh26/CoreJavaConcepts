package com.saiparesh;

public class Static {
	private String name = "Static";
	
	public static void one() {
		
	}
	
	public static void two() {
		
	}
	
	public static void three() {
		one();
		two();		
//		System.out.println(name);
	}
	
	public void four() {
		one();
		two();
		three();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Static.one();
		two();
		three();
//		four();
		Static newStatic = new Static();
		newStatic.four();
	}
}
