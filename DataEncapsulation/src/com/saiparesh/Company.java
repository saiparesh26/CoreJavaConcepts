package com.saiparesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
	private String name;
	private List<String> employees = new ArrayList<>();
	
	public void printSorted() {
		System.out.println("Company name = " + name);
		Collections.sort(employees);
		System.out.println("Sorted = " + employees);
	}

	public void setName(String name) {
		if (name == null) {
			System.out.println("Company name can't be null");
			return;
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addEmployee(String name) {
		if (name == null || name.isEmpty()) {
			System.out.println("Name can't be null");
			return;
		}
		employees.add(name);
	}
}

