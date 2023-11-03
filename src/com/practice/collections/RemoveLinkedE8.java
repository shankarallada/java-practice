package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 *8. Write a program to remove the first element from a LinkedList
	Input:
	[10 20 30 40 50]
	Output:
	LinkedList after removing the first element: 20 30 40 50.
 */
public class RemoveLinkedE8 {
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
		elements.remove(0);
		System.out.println("LinkedList after remove the first element: "+elements);
	}
}
