package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5.Write a program to remove duplicates from an ArrayList.
	Input:
	[10,20,30,20,40,30,50]
	Output:
	ArrayList after removing duplicates: [10,20,30,40,50]
 */

public class RemoveDuplicatesE5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		ArrayList list = new ArrayList();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		ArrayList list2 = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			int currentElement = (int) list.get(i);
			if (!list2.contains(currentElement)) {
				list2.add(currentElement);
			}
		}
		System.out.println(list2);
		sc.close();
	}

}
