package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	12345
	1234
	123
	12
	1
 */

public class PatternExample9 {

	public void example9(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample9 obj = new PatternExample9();
		obj.example9(n);
		sc.close();
	}

}
