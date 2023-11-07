package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
/*
 * 17. Write a Java program to find the union of two LinkedHashSets.
	Input:
	LinkedHashSet1: [1, 2, 3]
	LinkedHashSet2: [3, 4, 5]
	Output:
	Union: [1, 2, 3, 4, 5]
 */

public class UniontwoLinkedHashSetE17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet list = new LinkedHashSet();
		for(int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println("Enter the size of second elements: ");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet list2 = new LinkedHashSet();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list2);
		list.add(list2);
		System.out.println(list);
	}

}
