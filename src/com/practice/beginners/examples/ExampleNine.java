package com.practice.beginners.examples;

import java.util.Scanner;

public class ExampleNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(a+" * " +i+ " = "+a*i);
		}
		sc.close();
	}

}
