package com.practice.strings;

import java.util.Scanner;
/*
 * 1.Write a program to find the length of a string.
	Input:
	Enter a string: hello world
	Output:
	The length of the string is: 11
 */

public class LengthStingE1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String c=sc.nextLine();
		System.out.println("The length of the string is :"+c.length());
		sc.close();
	}

}
