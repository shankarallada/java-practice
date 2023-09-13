package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 7.Print a pattern of numbers in a triangle shape using nested loops.
 * Input:
 * Enter the number of rows: 5
 * Output:
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

public class TriangleShapeNumbersE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {//navigate next line
			for (int j=1; j<=i; j++) {//complete each line
				System.out.print(i);//print i value in each line
			}
			System.out.println(" ");//print spaces 
		}
		sc.close();

	}

}
