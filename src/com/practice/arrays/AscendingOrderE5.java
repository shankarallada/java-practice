package com.practice.arrays;

import java.util.Scanner;

/*
 * 5.Write a program to check if an array is sorted in ascending order.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 5
	Output:
	True
 */

public class AscendingOrderE5 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("enter the valid length");
			return;
		}
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// logic
		boolean result = true;
		for (int i = 1; i < array.length; i++) {
			int previous = array[i - 1];
			int current = array[i];
			if (current < previous) {
				result = false;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
