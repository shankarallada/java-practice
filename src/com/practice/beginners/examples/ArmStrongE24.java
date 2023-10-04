package com.practice.beginners.examples;

import java.util.Scanner;

public class ArmStrongE24 {
	public boolean isArmStrong(int n) {
		int temp = n, a, x = 0;
		int length = String.valueOf(n).length();
		while (n > 0) {
			a = n % 10;
			x = (int) (x + Math.pow(a, length));
			n = n / 10;

		}
		
		return temp==x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		ArmStrongE24 obj = new ArmStrongE24();
		if (obj.isArmStrong(n)) {
			System.out.println(n + " is an armstrong number");
		} else {
			System.out.println(n + " is not an armstrong number");
		}
		sc.close();
	}

}
