package com.practice.io;

import java.util.Scanner;

public class IoExampleThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("select an operation");
		System.out.println("Enter '1' for addition(+)");
		System.out.println("Enter '2' for subtraction(-)");
		System.out.println("Enter '3' for multiplication(*)");
		System.out.println("Enter '4' for division(/)");
		System.out.println("Enter '5' for modulo(%)");//code enhancement
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int add = a + b;
			System.out.println("addition : " + add);
			break;
		case 2:
			int sub = a - b;
			System.out.println("subtraction : " + sub);
			break;
		case 3:
			int mul = a * b;
			System.out.println("multiplication : " + mul);
			break;
		case 4:
			int div = a / b;
			System.out.println("division : " + div);
			break;
		case 5:
			int mod = a%b;
			System.out.println("modulo : "+mod);
			break;
		default:
			System.out.println("you entered a wrong choice");

		}

		sc.close();

	}

}
