package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Write a program to create an ArrayList and add five integers to it. Then
	print the elements of the ArrayList.
 */

public class AddElementsE1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		ArrayList elements = new ArrayList();
		for (int i=0;i<size;i++) {
			elements.add(sc.nextInt());
		}
		System.out.println(elements);
		sc.close();
	}

}
