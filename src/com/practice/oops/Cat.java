package com.practice.oops;

public class Cat extends Animal {
	public String name;
	public int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void meow() {
		System.out.println("meow");
	}

	public static void main(String[] args) {
		Cat obj = new Cat("tommy", 5);
		System.out.println(obj.name);
		obj.meow();
		obj.eat();
		obj.sleep();

	}

}
