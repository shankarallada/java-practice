package com.practice.strings;

import java.util.Scanner;

/*
 * 4.Write a program to check whether a string is a palindrome or not.
	Input:
	Enter a string: racecar
	Output:
	The string is a palindrome.
 */

public class PalindromeE4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reverse = "";
		System.out.println("Enter a string : ");
		String c=sc.nextLine();
		
		int length=c.length();
		
		for (int i=length-1;i<=0;i--) {
			reverse =reverse +c.charAt(i);
				if(c.equals(reverse)) {
					System.out.println("the string is palindrome.");
			}else {
				System.out.println("the string is not palindrome.");
			}
			}
		sc.close();
	}

}
