package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	12
 	123
	1234
	12345
	123456
 */


public class PatternExample12 {
	public void example12(int n) {
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample12 obj = new PatternExample12();
		obj.example12(n);
		sc.close();
	}

}
