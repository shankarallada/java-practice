package com.practice.arrays;

import java.util.Scanner;
/*
 * 23. Write a program to find the product of all elements except the current
	element in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 5
	Output:
	120 60 40 30 24
 */

public class ProductOfAllElementE23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int product=1;
		for(int i=0;i<n;i++) {
			product=product*array[i];
		}
		for(int i=0;i<n;i++) {
			array[i]=product/array[i];	
		}
		for(int i=0;i<n;i++){
			System.out.println(array[i]+" ");
		}
		sc.close();
	}

}
