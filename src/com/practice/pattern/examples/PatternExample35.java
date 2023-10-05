package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	1 2 3 4 5 
	2 3 4 5 1 
	3 4 5 2 1 
	4 5 3 2 1 
	5 4 3 2 1 
 */

public class PatternExample35 {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner sc = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
