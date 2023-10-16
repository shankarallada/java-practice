package com.practice.beginners.examples;

import java.util.Scanner;

/* 
 * 14. Write a program to print upto n prime numbers
 * Input:
 * Enter the value of n: 7
 * Output:
 * 2 3 5 7 
 */
public class PrimeNumberE1 {
	public void numberPrime(int n) {
		int i, j,  c;
		for (i = 2; i <= n; i++) {
			c = 0;
			for ( j= 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		System.out.println("prime numbers are :-");
		PrimeNumberE1 obj = new PrimeNumberE1();
		obj.numberPrime(n);
		sc.close();
	}

}
