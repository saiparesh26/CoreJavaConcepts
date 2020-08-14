package com.saiparesh;

public class DataEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setName("MyCompany");
		company.addEmployee("John");
		company.addEmployee("Mike");
		company.addEmployee(null);
		company.setName(null);
		company.addEmployee("");
		company.printSorted();
	}

}
