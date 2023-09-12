package com.practice.io;

import java.util.Scanner;

public class IoExampleTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name :");
		String a = sc.next();
		String greeting = "uma shankar";
		System.out.println("Enter a name : hello "+greeting);
		sc.close();
		
	}

}
