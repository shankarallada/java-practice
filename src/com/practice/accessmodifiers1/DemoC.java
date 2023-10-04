package com.practice.accessmodifiers1;

public class DemoC extends DemoA {
	public static void main(String[] args) {
		DemoC demoC = new DemoC();
		//System.out.println(demoC.name);//because it is private
		System.out.println(demoC.salary);//it is public
		System.out.println(demoC.age);//it is default
		System.out.println(demoC.org);//
	}

}
