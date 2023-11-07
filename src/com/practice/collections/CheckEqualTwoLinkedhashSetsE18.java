package com.practice.collections;

import java.util.LinkedList;
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
		LinkedList list1 = new LinkedList();
		for(int i=0;i<first;i++) {
			list1.add(sc.next());
		}
		System.out.println(list1);
		System.out.println("Enter the size of second elements: ");
		int second =sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list2 = new LinkedList();
		for(int i=0;i<first;i++) {
			list2.add(sc.next());
		}
		System.out.println(list2);
		
		if(list1.contains(list2)) {
			System.out.println("LinkedHashSets are not equal");
		}else {
			System.out.println("LinkedHashSets  are  equal");
		}
		
		
	}
	
}
