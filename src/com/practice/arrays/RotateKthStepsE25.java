package com.practice.arrays;

import java.util.Scanner;

/*
 * 25. Write a program to rotate an array by k steps.
	Input:
	Enter the length of the array: 7
	Enter the array elements: 1 2 3 4 5 6 7
	Enter k value: 3
	Output:
	After rotation: 5 6 7 1 2 3 4
 */

public class RotateKthStepsE25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter k value: ");
		int k = sc.nextInt();
		k = k % n;
		for (int i = 0; i < n; i++) {
			if (i < k) {
				System.out.print(array[n + i - k] + " ");
			} else {
				System.out.print(array[i - k] + " ");
			}
		}
		System.out.println();
		sc.close();
	}
}
