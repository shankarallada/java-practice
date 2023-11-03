package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 12. Write a program to check if a linked list is palindrome.
	Input:
	[1 2 3 2 1]
	Output:
	It is a palindrome
 */
public class PalindromeE12 {// solving by two pointer technique
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of length: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list = new LinkedList();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);

		LinkedList list2 = new LinkedList();
		list2.addAll(list);
		System.out.println(list2);
		int left = 0;
		int right = list2.size() - 1;
		while (left < right) {
			int temp = (int) list2.get(left);
			list2.set(left, list2.get(right));
			list2.set(right, temp);
			left++;
			right--;
		}
		System.out.println(list2);
		if (list.equals(list2)) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
		sc.close();
	}
}
