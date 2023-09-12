package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 12. Write a program to print the Fibonacci series up to n terms.
 * Input:
 * Enter the number of terms: 7
 * Output:
 * 0 1 1 2 3 5 8
 */

public class FibonacciNmbersE12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of terms : ");
		int n = sc.nextInt();
		int i, a = 0, b = 0, c = 1;
		for (i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}

		sc.close();
	}

}
