package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 14. Print Right Pascal’s Triangle using nested loops.
	Input:
	Enter the number of rows: 4
	Output:
 	*
 	* *
 	* * *
 	* * * *
 	* * *
 	* *
 	*

 */

public class RightPascalTriangleE14 {
	public void pascalRightTriangle(int n) {
		for (int i = 0; i < n; i++) {//navigate next line
			for (int j = 0; j <= i; j++) {//complete each line 
				System.out.print("* ");//print * each line 
			}
			System.out.println();
		}

		for (int i=n-1; i>=0;i--) {
			for (int j=0; j<=i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows : ");
		int n = sc.nextInt();
		RightPascalTriangleE14 obj = new RightPascalTriangleE14();
		obj.pascalRightTriangle(n);
		sc.close();
	}
}
