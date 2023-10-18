package com.practice.pattern.examples;

import java.util.Scanner;
/*
 *	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
 */

public class PatternExample2 {
	public void pattern2(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of rows : ");
		 int n =sc.nextInt();
		 PatternExample2 obj = new PatternExample2();
		 obj.pattern2(n);
		 sc.close();
	}
}
