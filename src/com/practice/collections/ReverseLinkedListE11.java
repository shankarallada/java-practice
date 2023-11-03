package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 11. Write a program to reverse a linked list.
	Input:
	[10 20 30 40 50]
	Output:
	LinkedList after reversal:[50 40 30 20 10]
 */
public class ReverseLinkedListE11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size  = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list = new LinkedList();
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		LinkedList list2 = new LinkedList();
		for (int k=list.size()-1; k >=0; k--) {
			int reverse = (int) list.get(k);
			list2.add(reverse);
		}
		System.out.println("after reverse: "+list2);
	}

}
