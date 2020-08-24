package com.saiparesh;

public class Husky extends Dog {
	public Husky(int age) {
		super(age);
		System.out.println("Husky");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("Husky eating");
	}
}
