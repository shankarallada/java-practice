package com.practice.beginners.examples;

import java.util.Scanner;

public class BinaryToDecimalE26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem,j = 1,decimal =0;
		System.out.println("Enter the binary number : ");
		int n=sc.nextInt();
		
		while(n!=0) {
			rem = n%10;
			decimal=decimal+rem*j;
			j=j*2;
			n=n/10;
		}
		System.out.println("Decimal number : "+decimal);
		sc.close();
	}
}
