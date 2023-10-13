package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 4.Print an inverted right triangle pattern of stars using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 	*****
 	****
 	***
 	**
 	*

 */

public class InvertedRightTriangleE4 {
	public void rightTriangleInverted(int n ) {
		for (int i=1; i<=n; i++) {//navigate next line
			for (int j=n; j>=i; j--) {//complete each row
				System.out.print("*");//print star in each line

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		InvertedRightTriangleE4 obj = new InvertedRightTriangleE4();
		obj.rightTriangleInverted(n);	
		sc.close();
	}

}
