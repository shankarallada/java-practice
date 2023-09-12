package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 1.Print a square pattern of stars using nested loops.
 * Input:
 * Enter the number of rows: 5
 * Output:
 * *****
 * *****
 * *****
 * *****
 * *****
 */

public class SquarePatternE1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows : ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
