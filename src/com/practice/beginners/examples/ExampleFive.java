package com.practice.beginners.examples;

import java.util.Scanner;

public class ExampleFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base  :");
		int base = sc.nextInt();
		System.out.println("Enter the exponent :");
		int expo= sc.nextInt();
		int result =1;
		for(int i=1; i<=expo; i++) {
			result *= base;
			System.out.println(base+" raised to the power of"+expo+ " is :" +result);
		}
		
	sc.close();
	}

}
