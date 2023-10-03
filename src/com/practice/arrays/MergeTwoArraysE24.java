package com.practice.arrays;

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
		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the length of the 2nd array: ");
		int m = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr2[] = new int[m];

		for (int j = 0; j < m; j++) {
			arr2[j] = sc.nextInt();
		}
		int size1 = arr1.length;
		int size2 = arr2.length;

		int output[] = new int[size1 + size2];

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				output[k] = arr1[i];
				k++;
				i++;
			} else {
				output[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (j < arr2.length) {
			output[k] = arr2[j];
			k++;
			j++;
		}
		while (j < arr2.length) {
			output[k] = arr1[i];
			k++;
			i++;
		}
		for (int p = 0; p < output.length; p++) {
			System.out.print("Merged array: "+output[p]+" ");
		}
		sc.close();
	}
}
