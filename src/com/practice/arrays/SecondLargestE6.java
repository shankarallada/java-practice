package com.practice.arrays;

import java.util.Scanner;

/*
 * 6.Write a program to find the second largest element in an array.
Input:
Enter the length of the array: 5
Enter the array elements: 10 5 20 25 15
Output:
The second largest element is 20

 */

public class SecondLargestE6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		if (n < 2) { //validation
			System.out.println("Enter minimum two values to find out second largest element");
			return;
		}
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (array[i] > firstMax) {
				secondMax = firstMax;
				firstMax = array[i];
			} else if (array[i] > secondMax && array[i] < firstMax) {
				secondMax = array[i];
			}
		}
		if (secondMax == Integer.MIN_VALUE) {//validation
			System.out.println("there is no second maximum in this array ");
		} else {
			System.out.println("the second largest element is " + secondMax);
		}
		sc.close();
	}

}
