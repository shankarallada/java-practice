package com.practice.strings;

import java.util.Scanner;

/*
 * 7.Write a program to concatenate two strings.
	Input:
	Enter the first string: hello
	Enter the second string: world
	Output:
	The concatenated string is: helloworld
 */

public class ConcatenateTwoStringsE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String c=sc.next();
		System.out.println("Enter the second string: ");
		String d=sc.next();
		
		String name=c.concat(d);
		System.out.println(name);
		sc.close();
	}
}
