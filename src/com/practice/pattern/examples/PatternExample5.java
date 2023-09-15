package com.practice.pattern.examples;

//import java.util.Scanner;
/*
 *  5 4 3 2 1 
	4 3 2 1 
	3 2 1 
	2 1 
	1 
	1 
	2 1 
	3 2 1 
	4 3 2 1 
	5 4 3 2 1 
 */

public class PatternExample5 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in) ;
		//System.out.println("Enter the number of rows : ");
		//int n = sc.nextInt();
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-i+1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//sc.close();
	}
}
