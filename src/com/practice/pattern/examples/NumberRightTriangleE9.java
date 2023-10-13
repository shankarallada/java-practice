package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 9.Print a pattern of numbers in a right triangle shape using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
	    1
	   12
	  123
	 1234
	12345
 */

public class NumberRightTriangleE9 {
	public void triangleNumberRight(int n) {
		for(int i=1; i<=n; i++){//navigate next line
			for(int j=1; j<=i; j++) {//complete next line 
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		NumberRightTriangleE9 obj = new NumberRightTriangleE9();
		obj.triangleNumberRight(n);		
		sc.close();
	}

}
