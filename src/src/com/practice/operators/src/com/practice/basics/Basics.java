package com.practice.basics;

public class Basics {
	float price;//instance variable declaration 
	static int salary;//static variable declaration
	
	public void print() {
		System.out.println(price);//non statics methods can accessed both static and non static variables
		salary = 40000;
		System.out.println(salary);
	}

	public static void main(String[] args) {
		String name = "shankar";//local variable declaration and initialization
		salary = 20000;//instance variable initialization
		
		//System.out.println(price);//not possible,non static variables can't be accessed inside of static methods
		System.out.println(salary);
		System.out.println(name);
		Basics obj = new Basics();
		obj.print();
		
		
	}

}
