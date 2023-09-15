package com.practice.pattern.examples;

//import java.util.Scanner;
/*
 *      1 
       1 2 
   	  1 2 3 
 	 1 2 3 4 
	1 2 3 4 5
 */

public class PatternExample6 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of rows : ");
		//int n = sc.nextInt();
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		//sc.close();
	}

}
