package com.practice.pattern.examples;

import java.util.Scanner;
/*
 *  1 
    2 6 
	3 7 10 
	4 8 11 13 
	5 9 12 14 15
 */

public class PatternExample27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = sc.nextInt();
		int k = 1;

		for (int i = 1; i <= rows; i++) {
			k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + rows - j;
			}
			System.out.println();
		}
		sc.close();
	}
}
