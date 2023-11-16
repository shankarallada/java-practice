package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 19. Write a Java program to remove all the elements from one HashSet that
	are not present in another HashSet.
	Input:
	HashSet1: [1, 2, 3, 4, 5]
	HashSet2: [3, 4, 5, 6]
	Output:
	HashSet1 after removing non-matching elements: [3, 4, 5]
 */
public class RemoveNonRepeatElementsE19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size1= sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		for(int i=0;i<size1;i++) {
			linkedHashSet.add(sc.nextInt());
		}
		System.out.println(linkedHashSet);
		System.out.println("Enter the size of elements: ");
		int size2= sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet linkedHashSet2 = new LinkedHashSet();
		for(int i=0;i<size2;i++) {
			linkedHashSet2.add(sc.nextInt());
		}
		System.out.println(linkedHashSet2);
		linkedHashSet.retainAll(linkedHashSet2);
		System.out.println("hashset1 after removing non matching elements: "+linkedHashSet);
		sc.close();
		}
	
}
