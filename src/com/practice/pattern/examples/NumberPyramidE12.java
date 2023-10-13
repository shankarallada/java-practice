package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 12. Print number pyramid pattern using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
	   1
	  123
	 12345
	1234567
   123456789
 */

public class NumberPyramidE12 {
	public void pyramidNumber(int n) {
		int z = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= z; k++) {
				System.out.print(k);
			}
			z+=2;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		NumberPyramidE12 obj = new NumberPyramidE12();
		obj.pyramidNumber(n);
		sc.close();
	}

}
