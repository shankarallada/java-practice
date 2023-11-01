package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 2.Write a program to find the maximum and minimum element in an ArrayList.
	Input:
	Enter the number of elements: 5
	Enter the array elements: 40 50 30 10 20
	Output:
	Maximum Element: 50
	Minimum Element: 10
 */

public class MaxAndMInE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the arraylist elememts: ");
		ArrayList list = new ArrayList();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int min=(int) list.get(0); //type casting
		int max=(int) list.get(0);
		for (Object object : list) {
			int number=(int)object;
			if(max<number) {
				max=number;
			}
			if(min>number) {
				min=number;
			}
		}
		System.out.println("maximum number: "+max);
		System.out.println("minimum number: "+min);
		//System.out.println(Collections.max(list));
		//System.out.println(Collections.min(list));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		sc.close();
	}

}
