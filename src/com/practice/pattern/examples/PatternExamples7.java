package com.practice.pattern.examples;

//import java.util.Scanner;
/*
 * 	5 4 3 2 1 
 	5 4 3 2 
	5 4 3 
	5 4 	
	5	   
 */

public class PatternExamples7 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of rows : ");
		//int n = sc.nextInt();
		
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=n; j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//sc.close();
	}

}
