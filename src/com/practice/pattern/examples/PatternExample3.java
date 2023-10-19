package com.practice.pattern.examples;

import java.util.Scanner;
/*
 *  1
	12	
	123
	1234
	12345
	1234
	123
	12
	1

 */

public class PatternExample3 {
	public void pattern3(int n) {
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n; i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample3 obj = new PatternExample3();
		obj.pattern3(n);
       sc.close();
	}

}
