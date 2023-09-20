package com.practice.strings;

import java.util.Scanner;

/*
 * 12. Write a program to find the first largest word in a sentence.
	Input:
	Enter a sentence: The quick brown fox jumps over the lazy dog
	Output:
	The largest word in the sentence is: quick
 */

public class LargestWordE12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		
		String[] words = s.split(" ");
		String largestword="";
		for (String word : words) {
			if(word.length()>largestword.length()) {
				largestword=word;
			}
		}
		System.out.println("the largest word in the sentence is : "+largestword);
		sc.close();
		
	}

}
