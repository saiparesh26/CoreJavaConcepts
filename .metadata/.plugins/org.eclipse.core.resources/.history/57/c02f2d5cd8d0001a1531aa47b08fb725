package com.saiparesh;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog husky = new Dog();
		System.out.println(husky.count); //warning
		System.out.println(Dog.count);
		
		Dog anotherDog = new Dog();
		anotherDog.incrementCounter(); //warning No need for instance variable
		
		Dog.incrementCounter();
		System.out.println(Dog.count);
		System.out.println(husky.count);
		
		husky  = null;
		anotherDog = null;
		
		System.out.println(husky.count);
		System.out.println(anotherDog.count);
		
	}

}
