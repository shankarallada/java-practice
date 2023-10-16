package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 1.Print a square pattern of stars using nested loops.
 * Input:
 * Enter the number of rows: 5
 * Output:
 * *****
 * *****
 * *****
 * *****
 * *****
 */

public class SquarePatternE1 {
	public void patternSquare(int n) {
		for (int i=0; i<n; i++) {//navigate next line
			for (int j=0; j<n; j++) {//complete each row
				System.out.print("*");//print star in each line
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows : ");
		int n = sc.nextInt();
		SquarePatternE1 obj = new SquarePatternE1();
		obj.patternSquare(n);
		sc.close();
	}

}
