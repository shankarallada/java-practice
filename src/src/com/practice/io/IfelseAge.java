package com.practice.io;

import java.util.Scanner;

public class IfelseAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of person");
		int age = sc.nextInt();
		if (age<0) {
			System.out.println("invalid age");
		}else if (age<=17 && age >1) {
			System.out.println("minor");
		} else if (age<=64 && age>18) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior citizen");
		}
		sc.close();
	}

}
