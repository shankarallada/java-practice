package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 14. Write a program to find the union of two linked lists.
Input:
	LinkedList1: [1 2 3 4 5]
	LinkedList2: [6 7 8 9 10]
	Output:
	LinkedList: [1 2 3 4 5 6 7 8 9 10]
 */
public class UnionTwoLinkedListE14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first elements: ");
		int first =sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list1 = new LinkedList();
		for(int i=0;i<first;i++) {
			list1.add(sc.nextInt());
		}
		
		System.out.println("Enter the size of second elements: ");
		int second = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list2 = new LinkedList();
		for(int i=0;i<second;i++) {
			list2.add(sc.nextInt());
		}
		System.out.println(list1);
		System.out.println(list2);
		for(int i=0;i<list2.size();i++) {
			int num = (int) list2.get(i);
			if(!list1.contains(num)) {
				list1.add(num);
			}
		}
		System.out.println(list1);
		
		sc.close();
	}
}
