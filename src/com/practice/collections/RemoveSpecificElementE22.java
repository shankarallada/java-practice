package com.practice.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 22. Write a Java program to remove a specific element from a TreeSet.
	Input:
	TreeSet: [Apple, Banana, Orange]
	Element to remove: Banana
	Output:
	TreeSet after removal: [Apple, Orange]
 */

public class RemoveSpecificElementE22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		TreeSet treeSet = new TreeSet();
		for(int i=0;i<size;i++) {
			treeSet.add(sc.next());
		}
		System.out.println(treeSet);
		System.out.println("Enter to remove: ");
		String remove =sc.next();
		
		treeSet.remove(remove);
		System.out.println(treeSet);
	}

}
