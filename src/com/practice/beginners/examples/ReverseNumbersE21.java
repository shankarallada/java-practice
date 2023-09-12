package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 21. Write a program to find the reverse of a given number.
 * Input:
 * Enter n: 1234
 * Output:
 * Reverse = 4321
 */

public class ReverseNumbersE21 {
	public static void main(String[] args) {
		int rev = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		while (n != 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		System.out.println("Reverse = " + rev);
		sc.close();
	}

}
