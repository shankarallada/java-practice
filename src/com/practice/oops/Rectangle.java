package com.practice.oops;

public class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
	public static void main(String[] args) {
		Rectangle obj= new Rectangle();
		obj.draw();// Method Overriding
	}
}
