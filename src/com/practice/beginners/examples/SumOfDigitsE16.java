package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 16. Write a program to find the sum of digits of a given number.
 * Input:
 * Enter a number: 12345
 * Output:
 * The sum of digits of 12345 is: 15
 * 
 */

public class SumOfDigitsE16 {
	public int digitsSum(int n) {
		long sum;
		for (sum=0; n!=0; n=n/10) {
			sum = sum+n%10;
		}
		return (int) sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n =sc.nextInt();
		SumOfDigitsE16 obj = new SumOfDigitsE16();
		int output = obj.digitsSum(n);
			System.out.println("the sum of digits : "+output);

	sc.close();
	}

}
