package com.practice.arrays;

import java.util.Scanner;

/*
 * 7.Write a program to reverse an array.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 1 2 3 4 5
	Output:
	5 4 3 2 1
 */

public class ReverseAnArrayE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n =sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
		
		int rev=array[0];
		for(int i=n-1;i>=0;i--) {
			rev=rev+array[n];
			System.out.println(rev);
			
		}
		sc.close();
	}

}
