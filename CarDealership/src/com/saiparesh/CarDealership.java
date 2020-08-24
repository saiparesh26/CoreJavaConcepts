package com.saiparesh;

public class CarDealership {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Paresh", 500000, "235, Doon Vihar, Dehradun");
		
		Vehicle vehicle = new Vehicle("Toyota", "Fortuner", 1500000);
		Vehicle vehicle2 = new Vehicle("Honda", "City",250000);
		
		Employee employee = new Employee();
		
		customer1.purchaseCar(vehicle, employee, false);
		customer1.purchaseCar(vehicle2, employee, false);
		
		Vehicle vehicle3 = new Vehicle("BMW", "M3", 4000000);
		Vehicle vehicle4 = new Vehicle("BMW", "M3", 4000000);
		
		boolean value = vehicle3.equals(vehicle4);
		System.out.println(value);
	}
}
