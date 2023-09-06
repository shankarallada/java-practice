package com.practice.io;

import java.util.Scanner;

public class IfelseEligibleVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if (age<18) {
			System.out.println("not eligible to vote");
		}
		else {
			System.out.println("eligible to vote");
		}
		sc.close();
	}

}
