package com.practice.collections;

import java.util.HashMap;
import java.util.Scanner;
/*
 * 28. Write a program to find the intersection of two arrays using a
	HashMap.
	Input:
	Array 1: [1, 2, 4, 3, 4, 5]
	Array 2: [4, 5, 6, 4, 7, 8]
	Output:
	Intersection of arrays: [4, 4, 5]
 */

public class IntersectionTwoArraysusingHashMapE28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int size1 = sc.nextInt();
		System.out.println("Enter the arrays: ");
		int[] arr1 =new int[size1];
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of second array: ");
		int size2 = sc.nextInt();
		System.out.println("Enter the arrays: ");
		int[] arr2 =  new int [size2];
		for (int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		HashMap hashMap1 = new HashMap();
		for(int i=0;i<size1;i++) {
			hashMap1.put(arr1, arr1[i]);
		}
		System.out.println(hashMap1);
		//int j=0;
		//for (int num : arr1) {
			//hashMap.put(arr1, hashMap);
		//}
		
		sc.close();
	}
}
