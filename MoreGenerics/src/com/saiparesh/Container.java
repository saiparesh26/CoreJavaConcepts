package com.saiparesh;

public class Container<i1, i2> {
	private i1 item1;
	private i2 item2;
	
	public Container(i1 item1, i2 item2) {	
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void print() {
		System.out.println("Printing contents of container");
		System.out.println(item1);
		System.out.println(item2);
	}
}
