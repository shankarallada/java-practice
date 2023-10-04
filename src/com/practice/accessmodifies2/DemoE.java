package com.practice.accessmodifies2;

import com.practice.accessmodifiers1.DemoA;

public class DemoE extends DemoA {
	public static void main(String[] args) {
		DemoE demoE = new DemoE();
		//System.out.println(demoE.name);//because it is private
		System.out.println(demoE.salary);//it is public
		//System.out.println(demoE.age);//it is default
		System.out.println(demoE.org);//
	}
}
