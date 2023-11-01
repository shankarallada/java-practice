package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3.Write a program to remove all occurrences of a specific element from an
	ArrayList.
	Input:
	Enter the number of elements: 7
	Enter the array elements: 20 30 10 50 30 45 60
	Element to remove: 30
	Output:
	ArrayList after removing all occurrences of element 30: [20,10,50,45,60]
 */
public class RemoveAllE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n =sc.nextInt();
		System.out.println("Enter the array elements: ");
		ArrayList list = new ArrayList();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("element to remove: ");
		int element =sc.nextInt();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if((int)list.get(i)==element) {
				list.remove(i);
			}
		}
		System.out.println(list);
		sc.close();
	}

}
