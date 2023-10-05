package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 19. Write a program to find the GCD of two numbers.
 * Input:
 * Enter the first number: 12
 * Enter the second number: 18
 * Output:
 * The GCD of 12 and 18 is: 6
 */

public class GcdE19 {
	public int greatestCommonDigit(int num1, int num2) {
		int gcd = 0;
		for (int i = 1; i <= num1 || i <= num2; i++) {// i<=12||i<=18->i<=18
			if (num1 % i == 0 && num2 % i == 0) {// check whether remainder is 0 or not for both numbers
				gcd = i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		GcdE19 obj = new GcdE19();
		int gcd = obj.greatestCommonDigit(num1, num2);
		System.out.println("The GCD of " + num1 + " and " + num2 + " is : " + gcd);
		sc.close();
	}

}
