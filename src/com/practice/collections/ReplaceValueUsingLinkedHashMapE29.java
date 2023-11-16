package com.practice.collections;

import java.util.Scanner;
import java.util.TreeMap;
/*
 * 29. Write a Java program to replace the value of a specific key in a
LinkedHashMap.
Input:
LinkedHashMap: {A=1, B=2, C=3}
Key to replace: B
New value: 5
Output:
LinkedHashMap after replacement: {A=1, B=5, C=3}
 */

public class ReplaceValueUsingLinkedHashMapE29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap treeMap = new TreeMap();
		treeMap.put("A", 1);
		treeMap.put("B", 2);
		treeMap.put("c", 3);
		System.out.println("LinkedHashMap: "+treeMap);
		System.out.println("key to replace: ");
		String replace = sc.next();
		System.out.println("new value: ");
		int newValue = sc.nextInt();
		
		treeMap.replace(replace, newValue);
		System.out.println("LinkedHashMap after replacement: "+treeMap);
		sc.close();
	}
}
