package com.practice.pattern.examples;

import java.util.Scanner;
/*
 *  1 3 5 7 9 	
	3 5 7 9 1 
	5 7 9 3 1 
	7 9 5 3 1 
	9 7 5 3 1 
 */

public class PatternExample37 {

	public void example37(int n) {
		for (int i = 1; i <= n; i++) {
			int j = (i * 2) - 1;
			for (int k = i; k <= n; k++) {
				System.out.print(j + " ");
				j += 2;
			}
			for (int l = (i * 2) - 3; l >= 1; l -= 2) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		PatternExample37 obj = new PatternExample37();
		obj.example37(n);
		sc.close();
	}
}
