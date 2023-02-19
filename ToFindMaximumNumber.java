package com.generics;

public class ToFindMaximumNumber {
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
		Integer num1 =10, num2 = 20, num3 =30;
		System.out.println("Max:" +  testMaximum(num1, num2, num3));
	}
}