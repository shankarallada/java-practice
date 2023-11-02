package com.practice.collections;

import java.util.ArrayList;

/*
 * 5.Write a program to remove duplicates from an ArrayList.
	Input:
	[10,20,30,20,40,30,50]
	Output:
	ArrayList after removing duplicates: [10,20,30,40,50]
 */

public class RemoveDuplicatesE5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(50);
		System.out.println(list);
		list.remove(3);
		list.remove(4);
		System.out.println(list);
		
	}

}
