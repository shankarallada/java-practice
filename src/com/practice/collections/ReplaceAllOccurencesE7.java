package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 7.Write a program to replace all occurrences of a specific substring in an
	ArrayList of strings.
	Input:
	[Apple,Banana,Mango,Orange]
	Substring to replace: an
	New substring: **
	Output:
	ArrayList after replacing an with **:[Apple,B****a,M**go,Or**ge]
 */
public class ReplaceAllOccurencesE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("orange");
		System.out.println(list);
		System.out.println("substring to replace: ");
		String replace =sc.next();
		System.out.println("new substring: ");
		String n = sc.next();
		
		//String result = list.replaceAll(null);
		
	}

}
