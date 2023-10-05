package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 10. Write a program to calculate the factorial of a number.
 * Input:
 * Enter a number: 5
 * Output:
 * The factorial of 5 is: 120
 */

public class FactorialE10 {
	public int  calculateFactorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		FactorialE10 obj = new FactorialE10();
		int fact = obj.calculateFactorial(a);
		System.out.println("factorial of " + a + " is: " + fact);

		sc.close();
	}

}
