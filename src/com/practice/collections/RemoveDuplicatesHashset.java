package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 20. Write a program to remove the duplicate elements in an array using a
HashSet.
Input:
Array: [1, 2, 3, 2, 4, 3, 5, 2, 4]
Output:
Array after removing duplicate elements: [1, 2, 3, 4, 5]
 */
public class RemoveDuplicatesHashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the array: ");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		LinkedHashSet linkedset = new LinkedHashSet();
		int j = 0;
		for (int num : arr) {
			linkedset.add(num);
		}
		int[] result = new int[linkedset.size()];
		for (Object object : linkedset) {
			int num = (int) object;
			result[j] = num;
			j++;
		}
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(linkedset);
		sc.close();
	}

}
