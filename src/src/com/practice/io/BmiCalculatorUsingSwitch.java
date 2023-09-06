package com.practice.io;

import java.util.Scanner;

public class BmiCalculatorUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight in kilograms");
		double weight = sc.nextDouble();
		System.out.println("Enter the height in meters");
		double height = sc.nextDouble(); 
		double bmi = weight/(height*height);
		System.out.println("your bmi :"+bmi);
		switch ((int)bmi) { //type casting
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("underweight");
		    break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
			System.out.println("normalweight");
		    break;
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		    System.out.println("overweight");
		    break;
		 default:
			 System.out.println("obese");
		}
		sc.close();		
	}

}
