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

	public void example35(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		PatternExample35 obj = new PatternExample35();
		obj.example35(n);
		sc.close();
	}
}
