package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 18. Write a Java program to check if two LinkedHashSets are equal.
	Input:
	LinkedHashSet1: [A, B, C]
	LinkedHashSet2: [C, A, B]
	Output:
	LinkedHashSets are equal
 */

public class CheckEqualTwoLinkedhashSetsE18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first elements: ");
		int first =sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		for(int i=0;i<first;i++) {
			linkedHashSet.add(sc.next());
		}
		System.out.println(linkedHashSet);
		System.out.println("Enter the size of second elements: ");
		int second =sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedHashSet linkedHashSet2 = new LinkedHashSet();
		for(int i=0;i<first;i++) {
			linkedHashSet2.add(sc.next());
		}
		System.out.println(linkedHashSet2);
		
		if(linkedHashSet.equals(linkedHashSet2)) {
			System.out.println("LinkedHashSets are  equal");
		}else {
			System.out.println("LinkedHashSets are not equal");
		}
		
		
	}
	
}
