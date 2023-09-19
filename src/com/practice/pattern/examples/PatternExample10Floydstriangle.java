package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */

public class PatternExample10Floydstriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();

		int num = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
			sc.close();
		}
	}

}
