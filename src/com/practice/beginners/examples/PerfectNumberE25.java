package com.practice.beginners.examples;

import java.util.Scanner;

public class PerfectNumberE25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int i = 1;

		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n) {
			System.out.println(n + " is a perfect number ");
		} else {
			System.out.println(n + " is not a strong number ");
		}
		sc.close();
	}

}
