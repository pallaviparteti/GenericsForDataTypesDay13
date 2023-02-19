package com.generics;

public class TestWithString {

	public static <T extends Comparable<T>> T testMaximum(T string1, T string2, T string3) {
		T max = string1;
		if(string2.compareTo(max) > 0) {
			max = string2;
		}
		if(string3.compareTo(max) > 0) {
			max = string3;
		}
		return max;
	}
	public static void main(String args[])
	{
		String string1 = "apple", string2 = "banana", string3 ="orange";
		System.out.println("Max: " + testMaximum(string1,string2,string3));
	}
}
