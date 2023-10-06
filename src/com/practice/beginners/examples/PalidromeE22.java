package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 22. Write a program to check if a given number is a palindrome or not.
	If the reverse of a number is the same as the original number, it is
	called a palindrome number. For example: 121, 34566543, 6, 56765, 87678,
	909 etc.
	For instance, 121 is a palindrome.
	After reversing 121, the reversed number is 121, so it is a palindrome
	number.
	Input1:
	Enter n: 121
	Output1:
	121 is palindrome
	Input2:
	Enter n: 123145
	Output2:
	123145 is not a palindrome
 */

public class PalidromeE22 {
	
	public boolean reverseSame(int num) {
		int temp,rev=0,rem;
		temp = num;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		return num==rev;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int num = sc.nextInt();
		PalidromeE22 obj = new PalidromeE22();
		//boolean output = obj.reverseSame(num);
		if (obj.reverseSame(num)) {
			System.out.println(num + " is palidrome");
		} else {
			System.out.println(num + " is not palidrome");
		}
		sc.close();
	}

}
