package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
	5 5 5 5 5 
	4 4 4 4 
	3 3 3 
	2 2 
	1
 */

public class PatternExample45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
