package com.practice.beginners.examples;

import java.util.Scanner;

public class ExampleEight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = sc.nextInt();
		System.out.println("Enter the second number : ");
		int y = sc.nextInt();
		System.out.println("Enter the third number : ");
		int z = sc.nextInt();
		if (x > y && x > z) {
			System.out.println("the largest number is :" + x);
		} else if (y > z) {
			System.out.println("the largest number is :" + y);
		} else {
			System.out.println("the largest number is :" + z);
		}
		sc.close();
	}

}
