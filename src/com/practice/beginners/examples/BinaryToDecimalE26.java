package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 26. Write a program to convert a given binary number to decimal.
 * 	Input:
	Enter the binary number: 101010
	Output:
	Decimal number = 42
 */

public class BinaryToDecimalE26 {
	public int converted (int n) {
		int rem,decimal=0, j = 1;
		while(n!=0) {
			rem = n%10;
			decimal=decimal+rem*j;
			j=j*2;
			n=n/10;
		}
		return decimal;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		int n=sc.nextInt();
		BinaryToDecimalE26 obj = new BinaryToDecimalE26();
		int decimal =obj.converted(n);
		
		System.out.println("Decimal number : "+decimal);
		sc.close();
	}
}
