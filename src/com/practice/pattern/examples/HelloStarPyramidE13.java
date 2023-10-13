package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 13. Print hollow star pyramid using nested loops.
	Input:
	Enter the number of rows: 5
	Output:	
 	    *
 	   * *
 	  *   *
 	 *     *
 	*********
 */
public class HelloStarPyramidE13 {
	public void starHello(int n) {
		int x = n, y = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
				if (j == x || j == y || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			x--;
			y++;
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		HelloStarPyramidE13 obj = new HelloStarPyramidE13();
    	 obj.starHello(n);
		sc.close();
	}
}
