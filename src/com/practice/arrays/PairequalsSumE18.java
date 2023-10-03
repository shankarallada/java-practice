package com.practice.arrays;

import java.util.Scanner;

/*
 * 18. Write a program to find a pair of an integer array whose sum is equal
	to a given number
	Input:
	Enter the length of the array: 4
	Enter the array elements: 1 4 10 -3
	Enter sum: 14
	Output:
	Pair of integer array is: 4 10
 */

public class PairequalsSumE18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[]array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter sum: ");
		int sum = sc.nextInt();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					System.out.println("pair of integer array is: "+array[i]+" "+array[j]);
					return;
				}
				}	
			}		
		sc.close();
	}
}
