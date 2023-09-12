package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 18. Write a program to find the LCM of two numbers.
 * Input:
 * Enter the first number: 4
 * Enter the second number: 6
 * Output:
 * The LCM of 4 and 6 is: 12
 */

public class LcmTwoNumbersE18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, lcm = 0, max, step;
		System.out.println("Enter the first number : ");
		a = sc.nextInt();
		System.out.println("Enter the second number : ");
		b = sc.nextInt();

		if (a > b) {
			max = step = a;
		} else {
			max = step = b;
		}
		while (a != 0) {
			if (max % a == 0 && max % b == 0) {
				lcm = max;
				break;
			}
			max += step;
		}
		System.out.println("LCM of "+a+" and "+b+" is : " + lcm);
		sc.close();
	}

	{

	}

}
