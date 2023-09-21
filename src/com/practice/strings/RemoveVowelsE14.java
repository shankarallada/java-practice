package com.practice.strings;

import java.util.Scanner;

/*
 * 14. Write a program to remove all the vowels from a string.
	Input:
	Enter a string: Hello World
	Output:
	The string without vowels is: Hll Wrld
 */

public class RemoveVowelsE14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("the string without vowels is : "+s1);
        sc.close();
	}

}
