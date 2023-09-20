package com.practice.strings;

import java.util.Scanner;

/*
 * 11. Write a program to find the first non-repeated character in a string.
	Input:
	Enter a string: morning
	Output:
	The first non-repeated character in the string is: m
 */
//TODO :do the same program using arrays
public class NonRepeatedE11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char currentChar=s.charAt(i);
			String beforeStr = s.substring(0, i);
			String afterStr=s.substring(i+1);
			if(!afterStr.contains(String.valueOf(currentChar))&& !beforeStr.contains(String.valueOf(currentChar))) {
				System.out.println("non-repeating character: "+currentChar);
				break;
			}
			
		}
		sc.close();
	}

}
