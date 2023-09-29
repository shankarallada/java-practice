package com.practice.arrays;

import java.util.Scanner;

/*
 * 10. Write a program to remove a specific element from an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 5
	Enter the element to be removed: 3
	Output:
	Array after removing 3: 1 2 4 5
 */

public class RemoveElementE10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the element: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] originalArray = new int[n];
		for (int i = 0; i < n; i++) {
			originalArray[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be removed: ");
		int element = sc.nextInt();

		int indexToRemove = -1;
		for (int i = 0; i < originalArray.length; i++) {
			if (originalArray[i] == element) {
				indexToRemove = i;
				break;
			}
		}

		if (indexToRemove != -1) {
			int[] newArray = new int[n - 1];
			int j = 0;
			for (int i = 0; i < originalArray.length; i++) {
				if (i != indexToRemove) {
					newArray[j] = originalArray[i];
					j++;
				}
			}

			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i]);
			}

		} else {
			System.out.println("Element not found");
		}
		sc.close();
	}

}
