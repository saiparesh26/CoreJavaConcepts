package com.saiparesh;

public class Employee {
	
	public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashInHand();
			runCreditHistory(customer, loanAmount);
		}
		else if (vehicle.getPrice() <= customer.getCashInHand()) {
			processTransaction(customer, vehicle);
		}
		else {
			System.out.println("Customer will need more money to purchase vehicle " + vehicle);
		}
	}

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " + 
				vehicle + " for the price " + vehicle.getPrice());		
	}

	private void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
}
