package com.practice.arrays;

import java.util.Scanner;

/*
 *17. Write a program to find the missing number in a given integer array with length n.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 6
	Enter n value: 6
	Output:
	The missing number is 5
 */

public class MissingNumberE17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the n value: ");
		int c=sc.nextInt();
		int sum = (n+1)*(n+2)/2;
		for (int i = 0; i < n ; i++) {
			sum = sum-array[i];
		}
		System.out.println("The missing number is: "+sum);
		sc.close();
	}

}
