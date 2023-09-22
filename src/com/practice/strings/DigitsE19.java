package com.practice.strings;

import java.util.Scanner;

/*
 * 19. Write a program that prompts the user to enter a string and then
	checks if it contains only digits (0-9).
	Input:
	Enter a string: 123456
	Output:
	The string contains only digits.
 */

public class DigitsE19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		boolean containsOnlyDigits = true;

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				containsOnlyDigits = false;
				break;
			}
		}

		if (containsOnlyDigits) {
			System.out.println("String contains only digits!");
		} else {
			System.out.println("String does not contain only digits!");
		}
		sc.close();
	}
}
