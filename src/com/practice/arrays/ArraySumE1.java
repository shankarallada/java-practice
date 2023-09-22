package com.practice.arrays;

import java.util.Scanner;
/*
 * 1.Write a program to find the sum of all elements in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 5
	Output:
	The sum of all elements in the array is 15
 */

public class ArraySumE1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array=new int[n];//declaration and instantiation
		for(int i =0;i<n;i++) {
			array[i]=sc.nextInt();//initialization
		}

		//logic
		int sum=0;
		for (int ele : array) {
			sum=sum+ele;
		}
		System.out.println("The sum of all elements in the array is "+sum);
		sc.close();
	}

}
