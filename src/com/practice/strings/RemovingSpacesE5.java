package com.practice.strings;

import java.util.Scanner;

/*
 * 5.Write a program to remove all the white spaces from a string.
	Input:
	Enter a string: hello world
	Output:
	The string after removing white spaces is: helloworld
 */

public class RemovingSpacesE5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String c = sc.next();

		String[] name = c.split(" ");
		for (String str : name) {
			System.out.println("the string after removing white spaces is: "+str);
		}
		sc.close();
	}

}
