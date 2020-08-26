package com.saiparesh.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Object myobj = new Object();
		String myvar = "hello";
		myobj = myvar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
//		employees = accountants; //  not allowed
		
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2; 	//Valid
		
		ArrayList<? extends Employee> employees3 = new ArrayList<>();  //Employee or children of employee
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		employees3 = accountants3;
		
		ArrayList<? super Employee> employees4 = new ArrayList<>();  //Employee or parent of employee
		ArrayList<Accountant> accountants4 = new ArrayList<>();
//		employees4 = accountants4; // not allowed
		
		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (Employee employee : employees) {
			employee.work();
		}
	}
}
