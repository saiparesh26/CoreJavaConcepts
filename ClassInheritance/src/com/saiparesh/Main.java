package com.saiparesh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Husky husky = new Husky(10);
		husky.setName("Mike");
		husky.printDetails();
		// super() is called automatically if there are superclasses constructors without argument
		
		Dog dog = new Dog(13);
		dog.setName("Rex");
		dog.printDetails();
		
		husky.eat();
	}

}
