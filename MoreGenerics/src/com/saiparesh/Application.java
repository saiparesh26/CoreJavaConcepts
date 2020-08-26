package com.saiparesh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Container<Integer, String> myval = new Container<>(12, "Sai");
		myval.print();
		Set<String> mySet1 = new LinkedHashSet<>();
		mySet1.add("Hello ");
		mySet1.add("Paresh ");
		Set<String> mySet2 = new LinkedHashSet<>();
		mySet2.add("How ");
		mySet2.add("are ");
		mySet2.add("you?");
		
		Set<String> resultSet = (union(mySet1, mySet2));
		
		Iterator<String> itr = resultSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new LinkedHashSet<E>(set1);
		result.addAll(set2);
		return result;
	}

}
