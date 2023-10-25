package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	5 4 3 2 1 
 	5 4 3 2 
	5 4 3 
	5 4 	
	5	   
 */

public class PatternExample7 {

	public void example7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PatternExample7 obj = new PatternExample7();
		obj.example7(n);
		sc.close();
	}

}
