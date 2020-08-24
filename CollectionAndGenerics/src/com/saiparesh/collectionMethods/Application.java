package com.saiparesh.collectionMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(5);
		values.add(10);
		values.add(1);
		values.add(56);
		
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(43);
		newList.add(5);
		newList.add(56);
		
		//merges two list
		values.addAll(newList);
		System.out.println(values);
		
		//removes the list items
		values.removeAll(newList);
		System.out.println(values);
		
		//clears the list
		values.clear();
		System.out.println(values);
		
		//checks for value
		boolean hasValue = values.contains(56);
		System.out.println(hasValue);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(4);
		hashSet.add(44);
		hashSet.add(23);
		hashSet.add(89);
		hashSet.add(57);
		
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		Collections.sort(myList);  //cannot sort hashset so convert hashset to list first
		System.out.println(myList);
		
		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("Paresh", 50000, "csd"));
		employees.add(new Employee("Vandana", 70000, "appsUk"));
		employees.add(new Employee("Sanketh", 40000, "dcx"));
		
		ArrayList<Employee> myEmployeesList = new ArrayList<Employee>(employees);
		
		Collections.sort(myEmployeesList);
		
		System.out.println(myEmployeesList);
		
	}

}
