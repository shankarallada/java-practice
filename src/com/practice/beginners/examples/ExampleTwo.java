package com.practice.beginners.examples;

import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int i;
		for (i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	sc.close();
	}

}
