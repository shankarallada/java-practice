package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 24. Write a program to merge two sorted arrays into a single sorted array.
	Input:
	Enter the length of the 1st array: 3
	Enter the array elements: 1 3 5
	Enter the length of the 2nd array: 3
	Enter the array elements: 2 4 6
	Output:
	Merged array: 1 2 3 4 5 6
 */

public class MergeTwoArraysE24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the 1st array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the length of the 2nd array: ");
		int m = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr1[] = new int[m];

		for (int j = 0; j < m; j++) {
			arr1[j] = sc.nextInt();
		}
		int size1 = arr.length;
		int size2 = arr1.length;

		int arr2[] = new int[size1 + size2];

		System.arraycopy(arr, 0, arr2, 0, size1);
		System.arraycopy(arr1, 0, arr2, size1, size2);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println("Merged array: " + Arrays.toString(arr2));
		sc.close();
	}

}
