package com.practice.oops;

public class Dog extends Animal{
	public String name;
	public int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void bark() {
		System.out.println("Barking");
	}

	public static void main(String[] args) {
		Dog obj = new Dog("scoopy", 9);
		Dog obj2 = new Dog("puppy", 7);
		Dog obj3 = new Dog("german shepherd", 20);
		System.out.println(obj.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);
		obj.bark();
		obj2.bark();
		obj3.bark();
		obj.eat();
		obj.sleep();

	}

}
