package com.saiparesh;

public class Sparrow extends Bird implements CanFly{

	public Sparrow(int age, double weight) {
		super(age, weight);		
	}

	@Override
	public void fly() {
		System.out.println("Sparrow is flying");
		
	}
	

}
