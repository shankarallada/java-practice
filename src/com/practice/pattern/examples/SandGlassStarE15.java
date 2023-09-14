package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 15. Print sandglass star pattern using nested loops.
	Input:
	Enter the number of rows: 4
	Output:
 	* * * *
 	 * * *
 	  * *
 	   *
 	   *
 	  * *
 	 * * *
 	* * * *
 */

public class SandGlassStarE15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();

		for (int i = 0; i <= n - 1; i++) {// navigate next line
			for (int j = 0; j < i; j++) {// print spaces
				System.out.print(" ");
			}
			for (int k = i; k <= n - 1; k++) {// print stars
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 0; i--) {// navigate next line
			for (int j = 0; j < i; j++) {// print spaces
				System.out.print(" ");
			}
			for (int k = i; k <= n - 1; k++) {// print stars
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
