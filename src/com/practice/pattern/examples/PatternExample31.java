package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 5 5 5 5 5 
   5 4 4 4 4 
   5 4 3 3 3 
   5 4 3 2 2 
   5 4 3 2 1 
 */

public class PatternExample31 {
	public void pattern31(int n) {
		int temp = 0;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
				temp = j;
			}
			for (int k = n - i + 1; k < n; k++) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:  ");
		int n = sc.nextInt();
		PatternExample31 obj = new PatternExample31();
		obj.pattern31(n);
		sc.close();
	}
}
