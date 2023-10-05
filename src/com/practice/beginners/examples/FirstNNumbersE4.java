package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 4.Write a program to sum of first n natural numbers using a while loop
 * Input:
 * Enter n: 6
 * Output:
 * Sum of first 6 natural numbers is: 21
 */

public class FirstNNumbersE4 {
	public int naturalNumbers(int a) {
		int sum = 0;
		int i = 1;
		while (i <= a) {
			sum = sum + i;
			i++;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		FirstNNumbersE4 obj = new FirstNNumbersE4();
		int sum=obj.naturalNumbers(a);
		System.out.println("sum of " + a + " natural numbers is :" + sum);
		sc.close();
	}
}
