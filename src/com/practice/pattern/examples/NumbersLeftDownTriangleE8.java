package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 8.Print a pattern of numbers in a left down triangle shape using nested loops.
 * Input:
 * Enter the number of rows: 5
 * Output:
 * 12345
 * 1234
 * 123
 * 12
 * 1
*/

public class NumbersLeftDownTriangleE8 {
	public void leftDownTriangle(int n) {
		for (int i=1;i<=n;i++) {//navigate next line
			for (int j=1;j<n-i+2;j++) {//complete each line
				System.out.print(j+"");//print numbers in each line
			}
			System.out.println();
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		NumbersLeftDownTriangleE8 obj = new NumbersLeftDownTriangleE8();
		obj.leftDownTriangle(n);	
			sc.close();	
	}

}
