package com.practice.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 23. Write a Java program to find the largest element in a TreeSet.
	Input:
	TreeSet: [3, 1, 4, 2, 5]
	Output:
	Largest element: 5
 */
public class LargestElementTreesetE23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		TreeSet list = new TreeSet();
		for(int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println("largest element: "+list.last());
		//System.out.println(list.first());
		sc.close();
	}

}
