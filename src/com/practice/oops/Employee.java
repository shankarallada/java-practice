package com.practice.oops;

public class Employee extends Object {
	String name;
	int age;
	int salary;
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		Employee obj = new Employee();
		//System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
	

}
