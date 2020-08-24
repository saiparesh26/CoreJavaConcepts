package com.saiparesh;

public class Customer {

	private String name;
	private double cashInHand;
	private String address;
	
	
	public Customer(String name, double cashInHand, String address) {
		this.name = name;
		this.cashInHand = cashInHand;
		this.address = address;
	}

	
	public String getName() {
		return name;
	}


	public double getCashInHand() {
		return cashInHand;
	}


	public String getAddress() {
		return address;
	}


	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, vehicle, finance);
	}
}
