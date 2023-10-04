package com.practice.accessmodifies2;

import com.practice.accessmodifiers1.DemoA;

public class DemoD {
	public static void main(String[] args) {
		DemoA demoA = new DemoA();
		//System.out.println(demoA.name);//cannot be accessed because it is private
		System.out.println(demoA.salary);//can be accessed because it is public
		//System.out.println(demoA.age);//cannot be accessed because it is in other package
	}

}
