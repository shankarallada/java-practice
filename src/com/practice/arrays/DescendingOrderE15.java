package com.practice.arrays;

import java.util.Scanner;

/*
 * 15. Write a program to sort an array in descending order.
	Input:
	Enter the length of the array: 5
	Enter the array elements: 10 5 20 25 15
	Output:
	Array in descending order: 25 20 15 10 5
 */

public class DescendingOrderE15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("Array in descending order: ");    
        for (int i = 0; i < array.length; i++) 
        {     
            System.out.print(array[i] + " ");    
        }    
		sc.close();
	}

}
