package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 19. Print Rhombus pattern using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 		******
 	   ******
 	  ******
 	 ******
 	******
 */

public class RhombusPatternE19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n;i++) {//navigate next line
			for(int j=1; j<=n-i;j++) {//print spaces each line
				System.out.print(" ");
			}
			for(int k=1;k<=n+1;k++) {//print stars each line
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
