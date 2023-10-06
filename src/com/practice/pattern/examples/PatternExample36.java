package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 1 3 5 7 9 
	3 5 7 9 1 
	5 7 9 1 3 
	7 9 1 3 5 
	9 1 3 5 7 
 */

public class PatternExample36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int j = (i * 2) - 1;
			for (int k = 1; k <= n; k++) {
				System.out.print(j + " ");
				j += 2;
				if (j > (n * 2) - 1)
					j = 1;
			}
			System.out.println();
		}
		sc.close();
	}
}
