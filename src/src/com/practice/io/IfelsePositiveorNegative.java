package com.practice.io;

import java.util.Scanner;

public class IfelsePositiveorNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num<0) {
			System.out.println("negative number");
		}
		else if(num>0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("you entered zero");
		}
		sc.close();
	}

}
