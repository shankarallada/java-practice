package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6.Write a program to remove all strings from an ArrayList that have a
specific length.
Input:
[Apple,Banana,Mango,Orange,Pineapple]
Output:
ArrayList after removing strings with length 6:[Apple,Mango,Pineapple]

 */

public class RemoveStringSpecificLengthE6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arraylist: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");

		ArrayList list = new ArrayList();
		int i = 0;
		while (i < size) {
			list.add(sc.next());
			i++;
		}
		System.out.println("Enter the length of string to remove: ");
		int length = sc.nextInt();
		System.out.println(list);
		for (int j = 0; j < list.size(); j++) {
			String fruit = (String) list.get(j);
			if (fruit.length() == length) {
				list.remove(j);
			}
		}
		System.out.println(list);
		sc.close();
	}

}
