package com.practice.strings;

import java.util.Scanner;

/*
 * 20. Write a Java program to check if two given strings are anagrams or not.
	Input:
	Enter first string: listen
	Enter second string: silent
	Output:
	Strings are anagrams.
 */

public class AnagramsE20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s = sc.nextLine();
		System.out.println("Enter second string: ");
		String c = sc.nextLine();
		int n1 = 0, n2 = 0;
		for (int i = 0; i < s.length(); i++) {
			n1 = n1 + s.charAt(i);
		}
		for (int i = 0; i < c.length(); i++) {
			n2 = n2 + c.charAt(i);
		}
		if (n1 == n2) {
			System.out.println("strings are anagrams.");
		} else {
			System.out.println("strings are not anagrams.");
		}
		sc.close();
	}

}
