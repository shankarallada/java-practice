package com.practice.collections;

import java.util.LinkedList;

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
		LinkedList elements = new LinkedList();
		elements.add(10);
		elements.add(20);
		elements.add(30);
		elements.add(40);
		elements.add(50);
		System.out.println(elements);
		elements.add(6);
		System.out.println("LinkedList after adding elements 6 at end: "+elements);
	}
}
