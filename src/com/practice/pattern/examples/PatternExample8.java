package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	5
	54	
	543
	5432
	54321
 */

public class PatternExample8 {

	public void example8(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample8 obj = new PatternExample8();
		obj.example8(n);
		sc.close();
	}

}
