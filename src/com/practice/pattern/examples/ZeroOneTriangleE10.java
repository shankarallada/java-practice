package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 10. Print Zero-One Triangle Pattern using nested loops.
	Input:
	Enter the number of rows: 6
	Output:
	1
	0 1
	1 0 1
	0 1 0 1
	1 0 1 0 1
	0 1 0 1 0 1

 */

public class ZeroOneTriangleE10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
			 System.out.print(((i+j)%2)+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
