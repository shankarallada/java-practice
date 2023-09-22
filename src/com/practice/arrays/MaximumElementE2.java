package com.practice.arrays;

import java.util.Scanner;
/*
 * 2.Write a program to find the maximum element in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 10 5 20 25 15
	Output:
	The maximum element is 25
 */

public class MaximumElementE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array element: ");
		int[] array = new int[5];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];
		for (int i = 1; i < n; i++) {
			if (max < array[i]);
			{
				max = array[i];
			}
		}
		System.out.println("the maximum element is " + max);
		sc.close();
	}

}
