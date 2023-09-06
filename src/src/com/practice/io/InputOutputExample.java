package com.practice.io;

import java.util.Scanner;

public class InputOutputExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");//writing to the console
		int num = sc.nextInt();//reading from console
		//logic or process
		int cube = num * num * num;
		//writing cube to the console
		System.out.println("cube of the number : "+ cube);
		//close resources
		sc.close();
	}

}
