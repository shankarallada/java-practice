package com.practice.pattern.examples;

import java.util.Scanner;

/*
 * 17. Print descending order pattern using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
	5
	5 4
	5 4 3
	5 4 3 2
	5 4 3 2 1
 */

public class DescendingOrderE17 {
	public void orderDescending(int n) {
		for (int i = n; i >= 1; i--) {//navigate next line 
			for (int j = n; j >= i; j--) {//print descending order numbers 
				System.out.print(j+" ");
			}
			System.out.println();
		}
	//	return n;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		DescendingOrderE17 obj = new DescendingOrderE17();
		obj.orderDescending(n);
		sc.close();
	}

}
