package com.brushup;

public class main {
	
	/**
	 * This is main method
	 * 
	 * @param args command line argurments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("args size = " + args.length);
			System.out.println(sum(2, 3));
	}
	
	/**
	 * Calculate the sum
	 * @param a operand
	 * @param b operand
	 * @return sum
	 */
	public static int sum(int a, int b) {
		return a+b;
	}

}
