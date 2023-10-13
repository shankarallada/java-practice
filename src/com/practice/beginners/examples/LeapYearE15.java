package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 15. Write a program to check whether a given year is a leap year or not.
 * Input:
 * Enter a year: 2024
 * Output:
 * 2024 is a leap year.
 */
public class LeapYearE15{
	public boolean yearLeap(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			
		}else { 
			
		}
		return year==0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		LeapYearE15 obj = new LeapYearE15();
		if(obj.yearLeap(year)) {
			System.out.println(year + " is  not a leap year.");
		} else {
			System.out.println(year + " is  a leap year.");
		}
		sc.close();
	}

}
