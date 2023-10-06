package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 2.Write a program to print the numbers from 1 to n.
 * Input:
 * Enter n: 5
 * Output:
 * 1 2 3 4 5
 */

public class NumbersE2 {
	public int firstNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			//System.out.print(i + " ");
			
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		NumbersE2 obj =new NumbersE2();
		int output = obj.firstNumbers(n);
		System.out.println(output);
			sc.close();
	}

}
