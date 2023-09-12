package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 9.Write a program to print the multiplication table of a number using a for loop
 * Input:
 * Enter a number: 5
 * Output:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */

public class MultiplicationTableE9 {
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
