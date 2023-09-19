package com.practice.strings;

import java.util.Scanner;

/*
 * 3.Write a program to count the number of vowels in a string.
	Input:
	Enter a string: hello world
	Output:
	The number of vowels in the string is: 3
 */

public class CountVowelsE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter a string : ");
		String c=sc.nextLine();
		

		for( int i=0;i<c.length();i++) {
			char ch=c.charAt(i);
			if(ch=='a'||ch =='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("the number of vowels in the string is : "+count);
		sc.close();
	}

}
