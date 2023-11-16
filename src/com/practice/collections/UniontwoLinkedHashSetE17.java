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
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		for(int i = 0; i < size; i++) {
			linkedHashSet.add(sc.nextInt());
		}
		System.out.println(linkedHashSet);
		System.out.println("Enter the size of second elements: ");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet linkedHashSet2 = new LinkedHashSet();
		for (int i = 0; i < size2; i++) {
			linkedHashSet2.add(sc.nextInt());
		}
		System.out.println(linkedHashSet2);
		linkedHashSet.addAll(linkedHashSet2);
		System.out.println("union: "+linkedHashSet);
	}

}
