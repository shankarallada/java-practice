package com.practice.pattern.examples;

import java.util.Scanner;
/*
 *  1
	21
	321
    4321
    54321
 */

public class PatternExample11 {
	public void example11(int n) {
		for(int i =1; i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n =sc.nextInt();
		PatternExample11 obj = new PatternExample11();
		obj.example11(n);		
		sc.close();
	}

}
