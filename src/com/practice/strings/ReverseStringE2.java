package com.practice.strings;

import java.util.Scanner;
/*
 * 2.Write a program to reverse a string.
  Input:
  Enter a string: hello world
  Output:
  The reversed string is: dlrow olleh
 */

public class ReverseStringE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String c=sc.nextLine();
		String rev="";
		for(int i=c.length()-1;i>=0;i--) {//length method
			rev=rev+c.charAt(i);//concat method and char at method
		}
		System.out.println(rev);
		sc.close();
	}

}
