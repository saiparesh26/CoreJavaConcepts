package com.saiparesh.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Integer> values = new HashSet<Integer>();	//Can contain Unique values only. Order is not maintained
		values.add(11);
		values.add(23);
		values.add(15);
		values.add(23);
		
		System.out.println(values);
		
		LinkedHashSet<Integer> values2 = new LinkedHashSet<Integer>(); // Maintain order
		values2.add(11);
		values2.add(15);
		values2.add(30);
		values2.add(2);
		values2.add(11);
		
		System.out.println(values2);
		
		HashSet<Animal> animals = new HashSet<Animal>();
		animals.add(new Animal("Dog", 12));
		animals.add(new Animal("Cat", 5));
		animals.add(new Animal("Eagle", 7));
		animals.add(new Animal("Lion", 6));
		animals.add(new Animal("Mouse", 2));
		animals.add(new Animal("Dog", 12));
		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

}
