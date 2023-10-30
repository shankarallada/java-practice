package com.practice.wrapperclasses;

public class BooleanWrapperclasses {
	public static void main(String[] args) {
		Boolean booleanObj = new Boolean(false);
		System.out.println(booleanObj.toString());
		System.out.println(booleanObj.hashCode());
		System.out.println(booleanObj.getClass());
		
		//parsing
		String salary ="20000";
		boolean sal = Boolean.valueOf(salary);
		System.out.println(sal);
		
		//untoboxing
		Boolean word = true;
		
		//unboxing
		boolean PWord = word;
		
		//comparison
		Boolean b1 = true;
		Boolean b2 = false;
		System.out.println(b1.equals(b2));
		
		boolean b3 = true;
		boolean b4 = false;
		System.out.println(b3==b4);
		
	}

}
