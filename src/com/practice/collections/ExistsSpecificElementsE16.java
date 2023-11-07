package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 16. Write a Java program to check if a specific element exists in a
	LinkedHashSet.
	Input:
	LinkedHashSet: [Java, Python, C++]
	Element to check: Python
	Output:
	Element Python exists in LinkedHashSet.
 */
public class ExistsSpecificElementsE16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet list = new LinkedHashSet();
		for(int i = 0; i < size; i++) {
			list.add(sc.next());
		}
		System.out.println(list);
		System.out.println("element to check: ");
		String word = sc.next();
		
		if (list.contains(word)) {
			System.out.println("element python exists in linkedhashset");
		}else {
			System.out.println("element python do not exists in linkedhashset");
		}
		
	}

}
