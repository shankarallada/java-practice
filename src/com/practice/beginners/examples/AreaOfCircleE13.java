package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 13. Write a program to calculate the area of a circle.
 * Input:
 * Enter the radius of the circle: 5
 * Output:
 * The area of the circle is: 78.54
 */

public class AreaOfCircleE13 {
	public double calculateArea(double r) {
		double pi = 3.142;
		double area;
		area = pi * r * r;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r = sc.nextDouble();
		AreaOfCircleE13 obj = new AreaOfCircleE13();
		double area = obj.calculateArea(r);
		System.out.println("The area of circle is : " + area);
		sc.close();
	}

}
