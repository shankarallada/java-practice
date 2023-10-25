package com.practice.oops;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int total=obj.add(5, 21);
		int total2=obj.add(8, 5, 03);
		System.out.println(total);
		System.out.println(total2);
	}
}
