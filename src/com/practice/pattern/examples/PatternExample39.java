package com.practice.pattern.examples;

import java.util.Scanner;

public class PatternExample39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int k = 1;
		int x = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				x = k + i - 1;
				for (int j = 1; j <= i; j++) {
					System.out.print(x + " ");
					x--;
					k++;
				}
			} else {
				x = k;
				for (int j = 1; j <= i; j++) {
					System.out.print(x + " ");
					x++;
					k++;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

