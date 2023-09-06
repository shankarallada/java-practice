package com.practice.operators;

public class ComparisonOperators {
	public static void main(String[] args) {
		// ==, != , >, <, >=, <= 
		// also called as relational operators
		// these operators results in true or false
		
		int a = 10;
		int b = 20;
		
		boolean isEqual = a==b;
		System.out.println("isequal : "+isEqual);
		boolean isNotEqual = a!=b;
		System.out.println("isnotequal : "+isNotEqual);
		boolean isGreaterthan = a>b;
		System.out.println("isgreaterthan : "+isGreaterthan);
		boolean isLessthan = a<b;
		System.out.println("islessthan : "+isLessthan);
		boolean isGreaterthanOrEqual = a>=b;
		System.out.println("isgreaterthanorequal : "+isGreaterthanOrEqual);
		boolean isLessthanOrEqual = a<=b;
		System.out.println("islessthanorequal : "+isLessthanOrEqual);
	}

}
