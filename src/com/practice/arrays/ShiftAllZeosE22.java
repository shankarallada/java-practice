package com.practice.arrays;

import java.util.Scanner;

/*
 * 22. Write a program to shift all zeros in an array to the end while
	maintaining the relative order of non-zero elements.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 0 1 0 3 12
	Output:
	Array after shifting zeros: 1 3 12 0 0
 */
public class ShiftAllZeosE22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]array= new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(array[i] != 0) {
				array[count++]=array[i];
			}	
		}
		while(count<n) {
			array[count++]=0;
		}
		for(int i=0;i<n;i++) {
		System.out.println(array[i]);
		}
		sc.close();
	}

}
