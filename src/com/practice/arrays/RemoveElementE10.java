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
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be removd: ");
		int element = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				break;
			}
		}
		System.out.println("array after removing " + element);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
