package com.practice.beginners.examples;

import java.util.Scanner;

public class ExampleSix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number :");
		double x =sc.nextDouble();
		System.out.println("Enter the second number : ");
		double y =sc.nextDouble();
		System.out.println("Enter the third number :");
		double z =sc.nextDouble();
		double average =(x+y+z)/3;
		System.out.println("the average of"+ x +","+ y + "and "+ z + " numbers :"+average);
		sc.close();
	}

}
