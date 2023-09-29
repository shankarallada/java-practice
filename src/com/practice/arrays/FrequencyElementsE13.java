package com.practice.arrays;

import java.util.Scanner;

/*
 * 13. Write a program to find the frequency of each element in an array.
	Input:
	Enter the length of the array: 8
	Enter the array elements: 1 2 3 2 4 1 5 1
	Output:
	1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time, 4 occurs 1 time, 5 occurs 1 time
 */

public class FrequencyElementsE13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n =sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			
		}
		
	}
}
