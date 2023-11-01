package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Scanner;

/*
 * 2.Write a program to find the maximum and minimum element in an ArrayList.
	Input:
	Enter the number of elements: 5
	Enter the array elements: 40 50 30 10 20
	Output:
	Maximum Element: 50
	Minimum Element: 10
 */

public class MaxAndMInE2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of elements: ");
//		int n = sc.nextInt();
//		System.out.println("Enter the array elememts: ");
//		int[] ArrayList = new int[n];
//		for (int i = 0; i < n; i++) {
//			ArrayList[i] = sc.nextInt();
//		}
		
		ArrayList maxMin = new ArrayList();
		maxMin.add(40);
		maxMin.add(50);
		maxMin.add(30);
		maxMin.add(10);
		maxMin.add(20);
		System.out.println(maxMin);
		
		System.out.println("Maximum Element: " +Collections.max(maxMin));
		System.out.println("minimum element: "+Collections.min(maxMin));
	    
		
	}

}
