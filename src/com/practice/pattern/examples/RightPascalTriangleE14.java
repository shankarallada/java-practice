package com.practice.pattern.examples;

import java.util.Scanner;

public class RightPascalTriangleE14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows : ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i=n-1; i>=0;i--) {
			for (int j=0; j<=i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
