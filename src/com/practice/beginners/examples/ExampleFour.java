package com.practice.beginners.examples;

import java.util.Scanner;

public class ExampleFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= a) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum of " + a + " natural numbers is :" + sum);
		sc.close();
	}
}
