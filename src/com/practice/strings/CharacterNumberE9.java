package com.practice.strings;

import java.util.Scanner;
/*
 * 9.Write a program to find the frequency of a character in a string.
	Input:
	Enter a string: hello world
	Enter a character: l
	Output:
	The frequency of 'l' in the string is: 3
 */

public class CharacterNumberE9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String c =sc.next();
		System.out.println("Enter a charater: ");
		int d = sc.nextInt();
		char ch = c.charAt(d);
		System.out.println("The frequency of "+d+" in the sting is: "+ch);
		sc.close();
	}

}
