package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 6.Write a program to calculate and print the average of three numbers.
 * Input:
 * Enter the first number: 4
 * Enter the second number: 7
 * Enter the third number: 2
 * Output:
 * The average of 4, 7, and 2 is: 4.33
 */

public class AverageofNumbersE6 {
	public double calculateAverage(double x, double y, double z) {
		double average =(x+y+z)/3;
		return average;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number :");
		double x =sc.nextDouble();
		System.out.println("Enter the second number : ");
		double y =sc.nextDouble();
		System.out.println("Enter the third number :");
		double z =sc.nextDouble();
		AverageofNumbersE6 obj = new AverageofNumbersE6();
		double average=obj.calculateAverage(x, y, z);
		System.out.println("the average of"+ x +","+ y + " and "+ z + " numbers :"+average);
		sc.close();
	}

}
