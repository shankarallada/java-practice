package com.practice.strings;

import java.util.Scanner;

/*
 * 18. Write a program that prompts the user to enter a string and then
	capitalizes the first letter of each word.
	Input:
	Enter a string: java programming is fun
	Output:
	Java Programming Is Fun
 */

public class CapitalizeFirstLetterE18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		String[] words =s.split(" ");
		for(int i=0;i<words.length;i++) {
			String firstLetter=words[i].substring(0, 1);
			String rem = words[i].substring(1);
			firstLetter=firstLetter.toUpperCase();
			words[i]=firstLetter+rem;
			}		
		
		String capitalized=String.join(" ", words);
		System.out.println(capitalized);
		sc.close();
	}

}
