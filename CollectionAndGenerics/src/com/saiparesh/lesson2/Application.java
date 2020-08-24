package com.saiparesh.lesson2;

import java.util.ArrayList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Dog");
		animals.add("Eagle");
		animals.add("Bird");
		
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
		
//		for (String animal : animals) {
//			System.out.println(animal);
//		}
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Yamaha", "Fazer", 110000, false));
		vehicles.add(new Vehicle("Honda", "City", 1000000, true));
		vehicles.add(new Vehicle("Toyota", "Fortuner", 2100000, true));
		vehicles.add(new Vehicle("Bajaj", "Pulsar", 80000, false));
		
//		for (Vehicle vehicle : vehicles) {
//			System.out.println(vehicle);
//		}
		
		printElements(vehicles);
		printElements(animals);
	}
	

	public static void printElements(List someList) {
		for (Object object : someList) {
			System.out.println(object);
		}
	}
}
