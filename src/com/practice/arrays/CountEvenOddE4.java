package com.practice.arrays;

import java.util.Scanner;
/*
 * 4.Write a program to count the number of even and odd numbers in an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 5
	Output:
	Even numbers = 2, Odd numbers = 3
 */

public class CountEvenOddE4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array element: ");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
		
		int evenNum=0;
		int oddNum=0;
		
		for(int i=0;i<n;i++) {
			if((array[i]%2)==0) {
				evenNum++;
			}else {
				oddNum++;
			}
		}
		System.out.println("Even numbers = "+evenNum+", odd numbers = "+oddNum);
		sc.close();
	}

}
