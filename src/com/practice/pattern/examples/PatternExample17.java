package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 12345
    2345
     345
      45
       5
       5
      45
     345
    2345
   12345
 */

public class PatternExample17 {
	public void pattern17(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(k);
			}
			System.out.println();

		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(k);
			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		PatternExample17 obj = new PatternExample17();
		obj.pattern17(n);
		sc.close();
	}
	

}
