package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	5
	45
	345
	2345
	12345
 */

public class PatternExample46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n =sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
