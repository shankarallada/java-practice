package com.practice.collections;

import java.util.LinkedList;

/*
 * Write a program to remove the first element from a LinkedList
	Input:
	[10 20 30 40 50]
	Output:
	LinkedList after removing the first element: 20 30 40 50.
 */
public class RemoveLinkedE8 {
	public static void main(String[] args) {
		LinkedList firstelement = new LinkedList();
		firstelement.add(10);
		firstelement.add(20);
		firstelement.add(30);
		firstelement.add(40);
		firstelement.add(50);
		System.out.println(firstelement);
		firstelement.remove(0);
		System.out.println("LinkedList after remove the first element: "+firstelement);
	}
}
