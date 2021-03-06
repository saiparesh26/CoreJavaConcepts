package com.saiparesh;

public class Animal {

	private int age;
	private String name;
	
	public Animal(int age) {
		System.out.println("Animal");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Name = "+ name + " Age = "+ age);
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public final double getAverageWeight() {
		return 10.0;
	}
}
