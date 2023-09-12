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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		int gcd = 0;
		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("The GCD of " + num1 + " and " + num2 + " is : " + gcd);
		sc.close();
	}

}
