package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 25. Write a program to check if a given number is perfect or not.
	A perfect number is a positive integer whose sum of its proper positive
	divisors equal to the perfect number.
	Input1:
	Enter n: 6
	Output1:
	6 is perfect.
	Input2:
	Enter n: 20
	Output2:
	20 is not perfect.
 */

public class PerfectNumberE25 {
	public boolean notPerfect(int n) {
		int i = 1;
		int sum=0;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		PerfectNumberE25 obj = new PerfectNumberE25();
		if (obj.notPerfect(n)) {
			System.out.println(n + " is a perfect number ");
		} else {
			System.out.println(n + " is not a perfect number ");
		}
		sc.close();
	}

}
