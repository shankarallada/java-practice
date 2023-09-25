package com.practice.arrays;

import java.util.Scanner;

/* 8.Write a program to find the average of all elements in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 10 20 30 40 50
	Output:
	The average of all elements in array is 30.0
 */

public class AverageElementsE8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array element: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum =sum + array[i];
		}
		double average = sum / array.length;
		System.out.println(" the average of all elements in array: " + average);
		sc.close();
	}

}
