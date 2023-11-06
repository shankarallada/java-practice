package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Write a program to add an element at the end of a LinkedList
	Input:
	[10 20 30 40 50]
	Element to add: 6
	Output:
	LinkedList after adding element 6 at end: 10 20 30 40 50 6.
 */
public class AddElementsLinkedE9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList elements = new LinkedList();
		for(int i=0;i<size;i++) {
			elements.add(sc.nextInt());
		}
		System.out.println(elements);
		elements.add(6);
		System.out.println("LinkedList after adding elements 6 at end: "+elements);
		sc.close();
	}
}
