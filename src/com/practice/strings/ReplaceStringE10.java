package com.practice.strings;

import java.util.Scanner;
/*
 * 10. Write a program to replace a character in a string.
	Input:
	Enter a string: hello world
	Enter the character to replace: o
	Enter the new character: a
	Output:
	The new string is: hella warld
 */

public class ReplaceStringE10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		System.out.println("Enter the character to replace: ");
		String b = sc.nextLine();
		System.out.println("Enter the new character: ");
		String c = sc.nextLine();
		
		String d=a.replace(b, c);
		System.out.println("The new string is : "+d);
		sc.close();
	}

}
