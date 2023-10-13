package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 18. Print palindromic number pyramid using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
	    1
	   212
	  32123
	 4321234
	543212345

 */

public class PalindromicNumberE18 {
	public void numberPalindrome(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PalindromicNumberE18 obj = new PalindromicNumberE18();
		obj.numberPalindrome(n);
		sc.close();
	}
}
