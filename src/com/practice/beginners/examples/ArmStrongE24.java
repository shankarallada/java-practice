package com.practice.beginners.examples;

import java.util.Scanner;

public class ArmStrongE24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp, a, x = 0;
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			x = x + (a * a * a);
		}
		if (temp == x) {
			System.out.println(temp + " is an armstrong number");
		} else {
			System.out.println(temp + " is not an armstrong number");
		}
		sc.close();
	}

}
