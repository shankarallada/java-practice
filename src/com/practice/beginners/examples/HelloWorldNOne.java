package com.practice.beginners.examples;

/*
 * 1.Write a program to print "Hello, World!" on the console.
 * Output:
 * Hello, World!
 */
public class HelloWorldNOne {
	public void greet(String name) {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		HelloWorldNOne obj = new HelloWorldNOne();
		obj.greet("Hello, world!");
	}
}
