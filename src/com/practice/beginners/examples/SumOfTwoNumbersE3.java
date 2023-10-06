package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 3.Write a program to calculate and print the sum of two numbers.
 * Input:
 * Enter the first number: 5
 * Enter the second number: 7
 * Output:
 * The sum of 5 and 7 is: 12
 * 
 */

public class SumOfTwoNumbersE3 {
	public int twoNumbersSum(int first, int second) {
		int sum = first + second;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int first = sc.nextInt();
		System.out.println("Enter the second number :");
		int second = sc.nextInt();
		SumOfTwoNumbersE3 obj = new SumOfTwoNumbersE3();
		int output = obj.twoNumbersSum(first, second) ;
		System.out.println("the sum of "+first+" and "+second+" is: "  + output);
		sc.close();
	}

}
