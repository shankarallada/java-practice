package com.practice.accessmodifiers1;

public class DemoA {
	private String name = "shiva";
	public int salary = 2000;
	int age=23;
	protected String org="google";

	public static void main(String[] args) {
		DemoA demoA = new DemoA();
		System.out.println(demoA.name);
		System.out.println(demoA.salary);
		System.out.println(demoA.age);
		System.out.println(demoA.org);
	}

}
