package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4.Write a program to sum elements from one ArrayList to another ArrayList.
	Input:
	ArrayList 1: [10, 20, 30]
	ArrayList 2: [40, 50, 60]
	Output:
	ArrayList1 after adding all elements from ArrayList 2: [50,70,90]
 */

public class SumTwoArrayListE4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of  ArrayList 1: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		ArrayList list1 = new ArrayList();
		for (int i = 0; i < size; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println(list1);

		System.out.println("enter the size of  ArrayList 2: ");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements: ");
		ArrayList list2 = new ArrayList();
		for (int i = 0; i < size2; i++) {
			list2.add(sc.nextInt());
		}
		System.out.println(list2);

		if (list1.size() != list2.size()) {
			System.out.println("Arraylists are not of the same size");
			return;
		}
		ArrayList sumList = new ArrayList();
		for (int i = 0; i < list1.size(); i++) {
			int sum = (int) list1.get(i) + (int) list2.get(i);
			sumList.add(sum);
		}
		System.out.println("arraylist1: " + list1);
		System.out.println("arraylist2: " + list2);
		System.out.println("ArrayList1 after adding all elements from ArrayList 2: " + sumList);
		sc.close();
	}

}
