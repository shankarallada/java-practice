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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			int j = (i * 2) - 1;
			for (int k = i; k <= rows; k++) {
				System.out.print(j + " ");
				j += 2;
			}
			for (int l = (i * 2) - 3; l >= 1; l -= 2) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
