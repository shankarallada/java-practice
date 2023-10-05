package com.practice.methods;

public class Student {
	public String name;
	public int rollNo;
	
	public Student(String name, int rollNo) {//parameterized constructor
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public static void main(String[] args) {
		Student obj = new Student("uma shankar", 404);
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
		Student obj2 = new Student("shiva kumar", 468);
		System.out.println(obj2.name);
		System.out.println(obj2.rollNo);
	}

}
