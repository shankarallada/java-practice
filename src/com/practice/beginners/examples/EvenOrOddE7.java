package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 7.Write a program to determine whether a number is even or odd.
 * Input:
 * Enter a number: 9
 * Output:
 * 9 is an odd number.
 */

public class EvenOrOddE7 {
	public boolean isEvenorOdd(int n) {
		int num=0;
		num =n%2;
		return num==0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		EvenOrOddE7 obj = new EvenOrOddE7();
		if (obj.isEvenorOdd(n)) {
			System.out.println(n + " is an even number.");
		} else {
			System.out.println(n + " is an odd number.");
		}
		sc.close();
	}

}
