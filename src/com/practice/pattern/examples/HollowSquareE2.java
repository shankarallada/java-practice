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
	public void squareHello(int n) {
		  for (int i = 1; i <= n; i++ ) {//navigate next line
		      for (int j = 1 ; j <= n; j++ ){//complete each line
		        if (i ==1 || i == n || j == 1 || j == n ){
		          System.out.print("*");
		        }
		        else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		HollowSquareE2 obj = new HollowSquareE2();
		obj.squareHello(n);
		sc.close();
		  }
		}


