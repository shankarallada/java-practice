package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 5 5 5 5 5 
   4 5 5 5 5 
   3 4 5 5 5 
   2 3 4 5 5 
   1 2 3 4 5 
 */

public class PatternExample26 {
	public void pattern26(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(j + " ");
			}

			for (int k = n - i; k < n; k++) {
				System.out.print(5 + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		PatternExample26 obj = new PatternExample26();
		obj.pattern26(n);
		sc.close();
	}
}
