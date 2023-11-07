package com.practice.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 21. Write a Java program to add elements to a TreeSet and display them.
	Input:
	Elements: 5, 2, 7, 1, 9
	Output:
	TreeSet: [1, 2, 5, 7, 9]
 */
public class AddElementsTreeSetE21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of elements: ");
		int size = sc.nextInt();
		System.out.println("enter the elements: ");
		TreeSet list = new TreeSet();
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
	}
}
