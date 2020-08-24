package com.saiparesh.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Applocation {

	public static void main(String[] args) {
		// Key value pairs
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Brave", "Showing courage");
		dictionary.put("Brilliant", "Clever or talented");
		dictionary.put("Joy", "Pleasure or happiness");
		dictionary.put("Confidence", "Feeling certain abouth truth of something");
		
//		for (String word : dictionary.keySet()) {
//			System.out.println(word);
//		}
		
		LinkedHashMap<String, String> dictionary2 = new LinkedHashMap<String, String>(); // Puts in order
		dictionary2.put("Brave", "Showing courage");
		dictionary2.put("Brilliant", "Clever or talented");
		dictionary2.put("Joy", "Pleasure or happiness");
		dictionary2.put("Confidence", "Feeling certain abouth truth of something");
		
//		for (String word : dictionary2.keySet()) {
//			System.out.println(word);
//			System.out.println(dictionary2.get(word));
//		}
		
//		for (Map.Entry<String, String> entry: dictionary.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		TreeMap<String, String> dictionary3 = new TreeMap<String, String>(); // Sorts keys in natural order. For strings natural order is alphabetical
		dictionary3.put("Brave", "Showing courage");
		dictionary3.put("Brilliant", "Clever or talented");
		dictionary3.put("Joy", "Pleasure or happiness");
		dictionary3.put("Confidence", "Feeling certain abouth truth of something");
		dictionary3.put("Joy", "ttttttttttttttttttt");
		for (Map.Entry<String, String> entry: dictionary3.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
