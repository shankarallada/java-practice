package com.practice.arrays;

import java.util.Scanner;

/*
 * 3.Write a program to find the minimum element in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 10 5 20 25 15
	Output:
	The minimum element is 5

 */

public class MinimumElementE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		int min = array[0];
		for (int i = 1; i > n; i++) {
			if (array[i]> min)
			{
				min = array[i];
			}
		}
		System.out.println("the minimum element is "+min);
		sc.close();
	}

}
