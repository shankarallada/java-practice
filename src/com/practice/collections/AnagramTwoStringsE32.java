package com.practice.collections;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 32. Write a program to check if two strings are anagrams using a HashMap.
Input:
String 1: "listen"
String 2: "silent"
Output:
The strings are anagrams
 */

public class AnagramTwoStringsE32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1: ");
		String word1 = sc.next();
		System.out.println("Enter the string2: ");
		String word2 = sc.next();
		HashMap hashMap1 = new HashMap();
		HashMap hashMap2 = new HashMap();
		for (char key : word1.toCharArray()) {
			int value = (int) hashMap1.getOrDefault(key, 0) + 1;
			hashMap1.put(key, value);
		}
		for (char key : word2.toCharArray()) {
			int value = (int) hashMap2.getOrDefault(key, 0) + 1;
			hashMap2.put(key, value);
		}
		System.out.println(hashMap1);
		System.out.println(hashMap2);
		if (hashMap1.equals(hashMap2)) {
			System.out.println("The strings are anagrams");
		} else {
			System.out.println("The srings are not anagarams");
		}
		sc.close();
	}

}
