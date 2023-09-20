package com.practice.pattern.examples;

import java.util.Scanner;

/*
 *    1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5 
   1 2 3 4 
  	1 2 3 
     1 2 
   	  1 

 */

public class PatternExample16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(k<=i) {
				System.out.print(k+" ");
				}else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<n-i+1;k++) {
				if(k<n-i+1) {
				System.out.print(k+" ");
				}else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
