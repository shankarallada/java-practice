package com.practice.io;

import java.util.Scanner;

public class IoExampleThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		System.out.println("addition : "+add);
		System.out.println("subtraction : "+sub);
		System.out.println("multiplication : "+mul);
		System.out.println("division : "+div);
		sc.close();
		
	}

}
