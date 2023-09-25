package com.practice.arrays;

import java.util.Scanner;

/*
 * 12. Write a program to find the number of occurrences of a given element in an array.
	Input:
	Enter the length of the array: 6
	Enter the array elements: 3 7 2 9 6 3
	Enter the element to search for: 3
	Output:
	The element 3 occurs 2 times in the array
 */

public class OccurrencesE12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array element: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search for: ");
		int searchFor = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == searchFor) {
				count++;
			}
			System.out.println("The element " + searchFor + " occurs " + count + " int the array");
		}
		sc.close();
	}

}
