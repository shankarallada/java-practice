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
		System.out.println("ArrayList 1: ");
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);

		System.out.println("Arraylist 2: ");
		ArrayList list2 = new ArrayList();
		list2.add(40);
		list2.add(50);
		//list2.add(60);
		System.out.println(list2);
		
		if(list1.size()!=list2.size()) {
			System.out.println("Arraylists are not of the same size");
			return ;
		}
		ArrayList sumList = new ArrayList();
		for(int i=0;i<list1.size();i++) {
			int sum = (int) list1.get(i)+ (int)list2.get(i);
			sumList.add(sum);
		}
		System.out.println(sumList);
		sc.close();
	}

}
