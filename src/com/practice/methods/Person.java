package com.practice.methods;

public class Person {
	public String name;
	public int age;
	
	public Person() {//default constructor
		this.name="uma shankar";
		this.age=22;
	}
	
	
	public static void main(String[] args) {
		Person obj=new Person();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}
