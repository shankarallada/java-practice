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
	public int revNumbers(int n) {
		int rev=0,rem;
		while (n != 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		ReverseNumbersE21 obj = new ReverseNumbersE21();
		int output = obj.revNumbers(n);
		
		System.out.println("Reverse = " + output);
		sc.close();
	}

}
