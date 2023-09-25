package com.practice.arrays;

import java.util.Scanner;

/*
 * 9.Write a program to search the index of a given element in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 10 20 30 40 50
	Enter the element to search: 30
	Output:
	The index of 30 is 2
 */

public class SearchIndexE9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int searchFor = sc.nextInt();

		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchFor) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("the index of " + searchFor + " was not found");
		} else {
			System.out.println("the index of " + searchFor + " is " + index);
		}

		sc.close();
	}

}
