package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 20. Write a program to find the sum of the squares of the first n natural numbers.
 *  For e.g. the sum of squares for the first five natural numbers (1 to 5) is 
 *  Input:
 *  Enter n: 5
 *  Output:
 *  sum of squares = 55
 */
public class SquaresE20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int i = 0,sum =0;
		while(i<=n) {
			sum+= i*i;
			i++;
		}
		System.out.println("sum of squares : "+sum);
		sc.close();
	}
}
