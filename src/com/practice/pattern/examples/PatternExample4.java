package com.practice.pattern.examples;

//import java.util.Scanner;
/*
 * 	12345
	1234	
	123
	12
	1
	1
	12
	123
	1234
	12345
 */

public class PatternExample4 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of rows : ");
		//int n = sc.nextInt();
		
		int n=5;
		
		for(int i=n; i>=1;i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//sc.close();
	}

}
