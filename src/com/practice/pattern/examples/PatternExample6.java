package com.practice.pattern.examples;

import java.util.Scanner;
/*
 *		1 
	   1 2 
	  1 2 3 
	 1 2 3 4 
	1 2 3 4 5
 */

public class PatternExample6 {

	public void example6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k < i) {
					System.out.print(k + " ");
				} else {
					System.out.print(k);
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample6 obj = new PatternExample6();
		obj.example6(n);
		sc.close();
	}

}
