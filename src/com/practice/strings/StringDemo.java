package com.practice.strings;

public class StringDemo {
	public static void main(String[] args) {
		//1.string creation
		String name ="shankar";//string literal->create in string pool
		String name2 = new String("shankar");//string object -> outside of string pool
		String name3 = "shankar";//string literal-> get from pool -> reusability -> optimize memory
		//System.out.println(name == name3);// same memory location
		//System.out.println(name == name2);//different memory location
		
		//2.equals method
		//System.out.println(name.equals(name3));
		//System.out.println(name.equals(name2));
		
		//3.equals ignore case
		String name4 = "Shankar";
		//System.out.println(name.equals(name4));
		//System.out.println(name.equalsIgnoreCase(name4));
		
		//4.concatination -> + or concat method
		String name5 = "Hello";
		//String name6 = name5 +" Uma"+name4;
		//System.out.println(name6);
		String name7 = name5.concat(" ").concat("Uma").concat(name4);
		//System.out.println(name7);
		
		//5.string length
		//System.out.println(name7.length());
		
		//6.substring 
		String name8 = "savalapuram shivakumar";
		System.out.println(name8.substring(17));//mention start index
		System.out.println(name8.substring(12));
		System.out.println(name8.substring(0, 11));//mention both start and end index
	}

}
