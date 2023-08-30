package com.practice.operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		
		a += a;//a=a+a=20+20=40 
		System.out.println("a+=a : "+a);
		b += b;//b=b+b=10+10=20
		System.out.println("b+=b : "+b);
		a -= b;//a=a-b=40-20=20
		System.out.println("a-=b : "+a);
		a *= b;//a=a*b=20*20=400
		System.out.println("a*=b : "+a);
		a /=b;//a=a/b=400/20=20
		System.out.println("a/=b : "+a);
		
		int x,y,z;
		x=y=z=100;
		System.out.println("x,y,z : "+x+","+y+","+z);
		
		String greeting = "hello";
		greeting += " world";//greeting=greeting+ " world" ->concatination
		System.out.println("greeting : "+greeting);
		
		//note: +operator does both addition and concatination. this is called as operator overloading 
	}

}
