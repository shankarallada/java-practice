package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	123454321
	2345432
	34543
	454		
	5	
 */

public class PatternExample23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + "");

			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print(k + "");

			}
			System.out.println();

		}
		sc.close();
	}

}
