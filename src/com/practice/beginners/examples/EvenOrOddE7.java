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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is an even");
		} else {
			System.out.println(a + " is an odd");
		}
		sc.close();
	}

}
