package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 5.Write a program to find the value of one number raised to the power of another.
 * Input:
 * Enter the base number: 2
 * Enter the exponent: 5
 * Output:
 * 2 raised to the power of 5 is: 32
 */

public class BaseAndExponentE5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base  :");
		int base = sc.nextInt();
		System.out.println("Enter the exponent :");
		int expo = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= expo; i++) {
			result *= base;
		}
		System.out.println(base + " raised to the power of" + expo + " is : " + result);

		sc.close();
	}

}
