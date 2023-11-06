package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Write a program to find the frequency of a given element in the linked
	list.
	Input:
	[1 2 3 2 4 2 2 5 6 3 3 4 2]
	Enter element: 2
	Output:
	Frequency of 2 is: 5
 */
public class FrequencyElementsE15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list = new LinkedList();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println("Enter the frequency Element: ");
		int searchfor = sc.nextInt();

		int count = 0;
		for (Object object : list) {
			int frequency = (int) object;
			if (searchfor == frequency) {
				count++;
			}
		}
		System.out.println("frequency of " + searchfor + " is: " + count);
		sc.close();
	}

}
