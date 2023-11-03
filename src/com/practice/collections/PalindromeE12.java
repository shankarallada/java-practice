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
public class PalindromeE12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of length: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		LinkedList list = new LinkedList();
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		
	}
}
