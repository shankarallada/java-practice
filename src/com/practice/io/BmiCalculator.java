package com.practice.io;

import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight in kilograms");
		double weight = sc.nextDouble();
		if (weight > 0) { //nested if
			System.out.println("Enter the height in meters");
			double height = sc.nextDouble();
			if (height > 0) { //nested if
				double bmi = weight / (height * height);
				System.out.println("your bmi :" + bmi);
				if (bmi < 10) { // 0 - 9 //plain if
					System.out.println("underweight");
				} else if (bmi < 25) { // 10-24
					System.out.println("normalweight");
				} else if (bmi < 30) { // 25-29
					System.out.println("overweight");
				} else { // above 30
					System.out.println("obese");
				}
			} else {
				System.out.println("height should be greater than 0");
			}

		} else {
			System.out.println("weight should be greater than 0");
		}

		sc.close();
	}

}
