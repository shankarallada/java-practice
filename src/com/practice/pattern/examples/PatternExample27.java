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
	public void pattern27(int n) {
		int k = 1;
		for (int i = 1; i <= n; i++) {
			k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k + n - j;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		PatternExample27 obj = new PatternExample27();
		obj.pattern27(n);
		sc.close();
	}
}
