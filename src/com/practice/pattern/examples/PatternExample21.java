package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 1 
   1 0 
   1 0 1 
   1 0 1 0 
 */

public class PatternExample21 {
	public void pattern21(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		PatternExample21 obj = new PatternExample21();
		obj.pattern21(n);
		sc.close();
	}

}
