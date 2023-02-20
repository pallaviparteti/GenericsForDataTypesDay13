package com.generics;

public class MaxValue<T extends Comparable<T>> {
	private T a, b, c;

	public MaxValue(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T getMax() {
		return testMaximum(a, b, c);
	}
	private T testMaximum(T a2, T b2, T c2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<T>> void printMax(T max) {
		System.out.println("Max: " + max);
	}
}  

