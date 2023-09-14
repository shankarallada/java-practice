package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 16. Print floyd's triangle using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
 */
public class FlodysTriangleE16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {//navigate next time 
			for (int j = 1; j <= i; j++) {//complete each line
				System.out.print(num++ +" ");//print numbers
			}
			System.out.println();
		}
		sc.close();
	}

}
