package com.practice.strings;

import java.util.Scanner;
/*
 * 8.Write a program to convert a string to lowercase.
	Input:
	Enter a string: HELLO WORLD
	Output:
	The string in lowercase is: hello world
 */

public class ConvertLowercaseE8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String c=sc.next();
		
		String name=c.toLowerCase();
		System.out.println(name);
		sc.close();
	}

}
