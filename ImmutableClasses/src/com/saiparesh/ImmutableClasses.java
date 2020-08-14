package com.saiparesh;

public class ImmutableClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex a = new Complex(5.0, 6.0);
		Complex b = new Complex(-3.0, 2.0);
		
		Complex bPlusA = b.plus(a);
		System.out.println("a real = " + a.getReal() + " imaginary " + a.getImaginary());
		System.out.println("b real = " + b.getReal() + " imaginary " + b.getImaginary());
		System.out.println("bPlusA real = " + bPlusA.getReal() + " imaginary " + bPlusA.getImaginary());
	}

}
