package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 1 
   1 2 
   1 2 3 
   1 2 3 5 
   1 2 3 5 8 
 */

public class PatternExample32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			int a = 0;
			int b = 1;

			for (int j = 1; j <= i; j++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
			System.out.println();
		}
		sc.close();
	}

}
