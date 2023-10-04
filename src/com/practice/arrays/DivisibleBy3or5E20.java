package com.practice.arrays;

import java.util.Scanner;

/*
 * 20. Write a program to find the sum of all elements in an array that are
	divisible by 3 or 5.
	Input:
	Enter the length of the array: 10
	Enter the array elements: 1 2 3 4 5 6 7 8 9 10
	Output:
	33
 */

public class DivisibleBy3or5E20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%3==0|| array[i]%5==0) {
				sum=sum+array[i];
			}
		}
		System.out.println("output: "+sum);
		sc.close();
	}

}
