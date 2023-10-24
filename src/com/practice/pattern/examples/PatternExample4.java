package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	12345
	1234	
	123
	12
	1
	1
	12
	123
	1234
	12345
 */

public class PatternExample4 {
	
	public void example4(int n) {
		for(int i=n; i>=1;i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample4 obj = new PatternExample4();
		obj.example4(n);
		sc.close();
	}
}
