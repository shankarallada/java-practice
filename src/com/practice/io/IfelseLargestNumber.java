package com.practice.io;

import java.util.Scanner;

public class IfelseLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int x = sc.nextInt();
		System.out.println("enter the second number");
		int y = sc.nextInt();
		System.out.println("enter the third number");
		int z = sc.nextInt();
		if (x > y && x > z) {
			System.out.println("the largest number is :"+x);
		} else if (y > z) {
			System.out.println("the largest number is :"+y);
		} else {
			System.out.println("the largest number is :"+z);
		}
      sc.close();
	}

}
