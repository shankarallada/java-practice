package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 5.Print a diamond pattern of stars using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 	  *
 	 ***
 	*****
 	 ***
 	  *
 
  formula:
  2 spaces ,1 star 
  1 space , 3 star
  0 space,  5 star
  1 space,  3 star
  2 spaces, 1 star
 */

public class DiamondE5 {
	public void patternDiamond(int n) {
		for (int i = 0; i < n/2+1; i++) {//print 3 lines or n/2+1 lines
			for (int j=0; j <n-3-i; j++) {//print spaces descending order
					System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++) {//print stars in odd number order
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n/2; i >0;i--) { // print 2 lines or n/2 lines
			for(int j =0; j<n-2-i;j++) {//print spaces ascending order 
				System.out.print(" ");
			}
			for(int k =0;k<2*i-1;k++) {//print stars in reverse odd number order 
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		DiamondE5 obj = new DiamondE5();
		obj.patternDiamond(n);
			sc.close();
	}

}
