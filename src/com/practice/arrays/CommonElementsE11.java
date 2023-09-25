package com.practice.arrays;

import java.util.Scanner;

/*
 * 11. Write a program to find the common elements between two arrays.
	Input:
	Enter the length of the 1st array: 5
	Enter the array elements: 1 2 3 4
	Enter the length of the 2nd array: 4
	Enter the array elements: 3 4 5 6
	Output:
	The common elements are: 3 4
 */

public class CommonElementsE11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth of the 1st array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the length of 2nd array: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arrayNew = new int[n1];
		for (int i = 0; i < n1; i++) {
			arrayNew[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < arrayNew.length; j++) {
				if (array[i] == (arrayNew[j])) {

					System.out.println("Common element is : " + (array[i]));
				}
			}
		}
		sc.close();
	}

}
