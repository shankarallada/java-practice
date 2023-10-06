package com.practice.beginners.examples;

import java.util.Scanner;
/*
 * 11. Write a program to convert temperature from Celsius to Fahrenheit.
 * Input:
 * Enter the temperature in Celsius: 25
 * Output:
 * 25°C is equal to 77°F.
 */

public class TemperatureE11 {
	public float tempCelsius(float celsius) {
		float f;
		 f = ((celsius * 9) / 5) + 32;
		 return f;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius : ");
		float celsius = sc.nextFloat();
		TemperatureE11 obj = new TemperatureE11();
		float output = obj.tempCelsius(celsius);
		System.out.println(celsius + "c is equal to " + output + "F");
		sc.close();
	}

}
