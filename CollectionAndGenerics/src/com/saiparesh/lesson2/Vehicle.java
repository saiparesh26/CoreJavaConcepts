package com.saiparesh.lesson2;

public class Vehicle {
	private String make;
	private String model;
	private int price;
	private boolean fourWheels;
	
	public Vehicle(String make, String model, int price, boolean fourDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWheels = fourDrive;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isFourDrive() {
		return fourWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWheels=" + fourWheels + "]";
	}
	
	
}
