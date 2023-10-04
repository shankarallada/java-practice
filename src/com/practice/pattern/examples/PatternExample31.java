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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:  ");

		int rows = sc.nextInt();
		int temp = 0;

		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
				temp = j;
			}
			for (int k = rows - i + 1; k < rows; k++) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
