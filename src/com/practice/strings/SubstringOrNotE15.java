package com.practice.strings;

import java.util.Scanner;

/*
 * 15. Write a program to check whether a string contains a given substring or not.
	Input:
	Enter a string: Hello World
	Enter the substring to search: World
	Output:
	The string contains the substring.
 */

public class SubstringOrNotE15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s=sc.nextLine();
		System.out.println("Enter the substring : ");
		String c=sc.nextLine();
		
		if(s.contains(c)) {
			System.out.println("the String contains the substring.");
		}else {
			System.out.println("the string does not contains the substring.");
		}
		sc.close();
	}

}
