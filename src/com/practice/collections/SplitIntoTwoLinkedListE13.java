package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 13. Write a program to split a Linked list into two halves.
	Input:
	[1 2 3 4 5]
	Output:
	LinkedList1: [1 2 3]
	LinkedList2: [4 5]
 */
public class SplitIntoTwoLinkedListE13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		LinkedList linkedlist1 = new LinkedList();
		LinkedList linkedlist2 = new LinkedList();
		for (int i = 0; i < n; i++) {
			if (i <= 2) {
				int num = (int) list.get(i);
				linkedlist1.add(num);
			} else if (i > 2) {
				int num2 = (int) list.get(i);
				linkedlist2.add(num2);
			}
		}
		System.out.println("LinkedList1: "+linkedlist1);
		System.out.println("LinkedList2: "+linkedlist2);
		sc.close();

	}
}
