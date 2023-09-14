package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 20. Print diagonal number pattern using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
	1 0 0 0 0
	0 2 0 0 0
	0 0 3 0 0
	0 0 0 4 0
	0 0 0 0 5
 */

public class DiagonalNumberE20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {//navigate next line
			for (int j = 1; j < i; j++) {// 
				System.out.print("0 ");
			}
			System.out.print(i + " ");
			for (int k = i; k < n; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
