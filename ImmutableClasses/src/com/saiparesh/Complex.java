package com.saiparesh;

//Immutable classes do not have setters
public class Complex {
	
	private final double real;
	private final double imaginary;
	
	public Complex(double real, double imaginary) {	
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}
	
	public Complex plus(Complex b) {
		double newReal = real + b.real;
		double newImaginary = imaginary + b.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public Complex minus(Complex b) {
		double newReal = real - b.real;
		double newImaginary = imaginary - b.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public static Complex plus(Complex a,  Complex b) {
//		double real = a.real + b.real;
//		double imaginary = a.imaginary + b.imaginary;
//		return new Complex(real, imaginary);
		return a.plus(b);
	}
}
