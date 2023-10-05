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
	public int leastNumber(int num1, int num2) {
		int hcf = 0, lcm = 0;
		for (int i = 1; i <= num1 || i <= num2; i++) {// i<=4||i<=6->i<=6
			if (num1 % i == 0 && num2 % i == 0) {// check whether remainder is 0 or not for both numbers
				hcf = i;// store temporary HCF
			}
		}
		lcm = num1 * num2 / hcf;
		return lcm;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		LcmTwoNumbersE18 obj = new LcmTwoNumbersE18();
		int lcm = obj.leastNumber(num1, num2);
		
		//System.out.println("HCF of given two numbers is :" + hcf);
		System.out.println("lcm of "+num1+" and "+num2+" is : " + lcm);
		sc.close();
	}

}
