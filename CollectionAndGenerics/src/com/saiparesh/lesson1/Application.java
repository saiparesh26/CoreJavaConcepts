package com.saiparesh.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		ArrayList words = new ArrayList();  //Same as ArrayList<Object> words = new ArrayList<Object>(); 
		words.add("Hello");
		words.add("there");
		words.add("Sai");
		words.add("Paresh");
		System.out.println(words);
		words.remove(2);
		System.out.println(words);
		words.remove("Paresh");
		System.out.println(words);
		words.add(12);
		words.add(15.00);
		words.add('H');
		System.out.println(words);
		
		int item1 = (int) words.get(2);
		System.out.println(item1);
		
		Object item2 = words.get(1);
		System.out.println(item2);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(43);
		numbers.add(26);
		System.out.println(numbers);
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
