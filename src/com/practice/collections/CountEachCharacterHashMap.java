package com.practice.collections;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*
 * 25. Write a program to count the frequency of each character in a given
string using a HashMap.
Input:
String: "Hello World!"
Output:
Character frequency:
'H': 1
'e': 1
'l': 3
'o': 2
' ': 1
'W': 1
'r': 1
'd': 1
'!': 1
 */
public class CountEachCharacterHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		LinkedHashMap hashMap = new LinkedHashMap();
		for (char character : arr) {
			if (hashMap.containsKey(character)) {
				int count = (int) hashMap.get(character);
				count++;
				hashMap.replace(character, count);
			} else {
				hashMap.put(character, 1);
			}
		}
		System.out.println(hashMap);
		sc.close();
	}
}
