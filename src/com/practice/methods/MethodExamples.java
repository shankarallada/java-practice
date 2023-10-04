package com.practice.methods;

public class MethodExamples {
	public String message;
	public String goal;
	public MethodExamples(String message) {
		System.out.println("i am in constructor with single parameter");
		this.message=message;
	}
	
	public MethodExamples(String message, String goal) {
		System.out.println("i am in constructor with double parameter");
		this.message=message;
		this.goal=goal;
	}
	
	public void printMessage() {
		System.out.println(this.message);
		System.out.println(this.goal);
	}
	
	public int add(int a, int b){ //methods are useful for code re usability
		int sum = a+b;
		return sum;
	}
	
	public void greet(String name) {
		System.out.println("welcome "+name);
	}
	
	public float calculateRectangleArea(float length, float breadth) {
		return length*breadth;
	}
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	
	
	public static void main(String[] args) {
		MethodExamples obj = new MethodExamples("i am learning java","i want to get job");
		int output = obj.add(2, 3);
		System.out.println(output);
		int output2 = obj.add(10, 20);
		System.out.println(output2);
		obj.greet("uma shankar");
		obj.greet("shiva kumar");
		float area=obj.calculateRectangleArea(12.3f, 9.3f);
		System.out.println(area);
		float area2=obj.calculateRectangleArea(10, 20);
		System.out.println(area2);
		boolean isEven = obj.isEven(20);
		System.out.println(isEven);
		boolean isEven2 = obj.isEven(15);
		System.out.println(isEven2);
		obj.printMessage();
	}

}
