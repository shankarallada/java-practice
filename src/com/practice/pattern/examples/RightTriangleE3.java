package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 3.Print a right triangle pattern of stars using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 	*
 	**
 	***
 	****
 	*****
 */

public class RightTriangleE3 {
	public void triangleRight(int n) {
		for (int i = 1; i <= n; i++) {//navigate to next line
			for (int j = 1; j <= i; j++) {//complete in each line
				System.out.print("* ");//print star in each line 
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		RightTriangleE3 obj = new RightTriangleE3();
		obj.triangleRight(n);		
		sc.close();
	}

}
