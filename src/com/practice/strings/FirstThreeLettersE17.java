package com.practice.strings;

import java.util.Scanner;

/*
 * 17. Write a program that prompts the user to enter a word, and then prints
	out the first three letters of the word using the substring() method.
	Input:
	Enter a word: Elephant
	Output:
	First three letters: Ele
 */

public class FirstThreeLettersE17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s = sc.nextLine();
		
		String sub = s.substring(0, 3);
		System.out.println("First three letters: "+sub);
		sc.close();
	}
}
