package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 	1        1
	12      21
	123    321
	1234  4321
	1234554321
 */

public class patternExample38 {
	
	public void example38(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i * 2; j < n * 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		patternExample38 obj = new patternExample38();
		obj.example38(n);
		sc.close();
	}
}
