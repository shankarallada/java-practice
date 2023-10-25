package com.practice.oops;

public class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
	public static void main(String[] args) {
		Circle obj=new Circle();
	    obj.draw();// Method Overriding
	}
}
