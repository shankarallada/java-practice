package com.practice.collections;

import java.util.Scanner;
import java.util.TreeMap;

/*
 * 24. Write a Java program to get the value associated with a specific key
	in a TreeMap.
	Input:
	TreeMap: {Apple=Red, Banana=Yellow, Orange=Orange}
	Key to retrieve value: Banana
	Output:
	Value associated with key Banana: Yellow
 */
public class ValueAssociatedSpecificKeyTreeMapE24 {
	public static void main(String[] args) {
		
		TreeMap treeMap = new TreeMap();
		treeMap.put("apple", "Red");
		treeMap.put("Banana", "Yellow");
		treeMap.put("Orange", "Orange");
		System.out.println(treeMap);

		Scanner sc = new Scanner(System.in);
		System.out.println("Key to retrieve value:");
		String retrieve = sc.nextLine();
		String value = (String) treeMap.get(retrieve);

		if (value != null) {
			System.out.println("Value associated with key " + retrieve + " :" + value);
		} else {
			System.out.println("key" + retrieve + " not found in the Treemap.");
		}
		sc.close();
	}

}
