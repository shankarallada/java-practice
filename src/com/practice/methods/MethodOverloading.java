package com.practice.methods;

public class MethodOverloading {//same method name and different parameters
	
	public int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public double add(double num1, double num2) {
		double sum = num1+num2;
		return sum;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		int output =obj.add(2, 4);
		System.out.println(output);
		double output2 = obj.add(2.1, 4.1);
		System.out.println(output2);
	}

}
