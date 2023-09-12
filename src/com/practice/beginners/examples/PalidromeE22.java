package com.practice.beginners.examples;

import java.util.Scanner;

public class PalidromeE22 {
	public static void main(String[] args) {
		int temp, rev = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int num = sc.nextInt();
		temp = num;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		if (num == rev) {
			System.out.println(num + " is palidrome");
		} else {
			System.out.println(num + " is not palidrome");
		}
		sc.close();
	}

}
