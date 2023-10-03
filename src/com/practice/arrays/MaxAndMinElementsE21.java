package com.practice.arrays;

import java.util.Scanner;

/*
 * 21. Write a program to find the maximum and minimum product of any two
	elements in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 2 4 6 1 5
	Output:
	Maximum product: 30, Minimum product: 2
 */

public class MaxAndMinElementsE21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int firstmin = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (array[i] > firstMax) {
				secondMax = firstMax;
				firstMax = array[i];
			} else if (array[i] > secondMax && array[i] < firstMax) {
				secondMax = array[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (array[i] < firstmin) {
				secondmin = firstmin;
				firstmin = array[i];
			} else if (array[i] < secondmin && array[i] != firstmin) {
				secondmin = array[i];
			}
		}
		System.out.println("maximum product: " + secondMax * firstMax);
		System.out.println("minimum product: " + secondmin * firstmin);
		sc.close();
	}
}
