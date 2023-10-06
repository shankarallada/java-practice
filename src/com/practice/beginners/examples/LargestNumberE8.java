package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 8.Write a program to find the largest of three numbers.
 * Input:
 * Enter the first number: 7
 * Enter the second number: 4
 * Enter the third number: 9
 * Output:
 * The largest number is: 9
 */

public class LargestNumberE8 {
	public int bigNumber(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} else if (y > z) {
			return y;
		} else {
			return z;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = sc.nextInt();
		System.out.println("Enter the second number : ");
		int y = sc.nextInt();
		System.out.println("Enter the third number : ");
		int z = sc.nextInt();
		LargestNumberE8 obj = new LargestNumberE8();
		int output = obj.bigNumber(x, y, z);
		System.out.println("The largest number is: "+output);
		sc.close();
	}

}
