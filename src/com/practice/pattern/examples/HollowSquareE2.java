package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 2.Print a hollow square pattern of stars using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 	*****
 	*   *
 	*   *
 	*   *
 	*****
 */

public class HollowSquareE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();

		    for (int i = 1; i <= n; i++ ) {
		      for (int j = 1 ; j <= n; j++ ){
		        if (i ==1 || i == n || j == 1 || j == n ){
		          System.out.print("*");
		        }
		        else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
		    sc.close();
		  }
		}


