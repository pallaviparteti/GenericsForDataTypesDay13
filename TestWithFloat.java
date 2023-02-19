package com.generics;

public class TestWithFloat {
	public static <T extends Comparable<T>> T testMaximum(T num1, T num2, T num3) {
		T max = num1;
		if(num2.compareTo(max) > 0) {
			max = num2;
		}
		if(num3.compareTo(max) > 0) {
			max = num3;
		}
		return max;
	}
	public static void main(String args[])
	{
		Float num1 =10.1f, num2 = 20.2f, num3 =30.3f;
		System.out.println("Max:" +  testMaximum(num1, num2, num3));
	}
}

