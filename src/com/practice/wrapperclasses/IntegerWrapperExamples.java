package com.practice.wrapperclasses;

public class IntegerWrapperExamples {
	
	public static void main(String[] args) {
		//creation
		Integer intObj = new Integer(10);
		System.out.println(intObj.intValue());
		System.out.println(intObj.doubleValue());
		String str =intObj.toString();
		System.out.println(str);
		
		//parsing
		String salary ="20000";
		int sal = Integer.valueOf(salary);
		System.out.println(sal);
		
		//autoboxing
		Integer age =20;
		
		//unboxing
		int pAge =age;
		
		//comparison
		Integer a =20;
		Integer b =20;
		System.out.println(a.equals(b));
		
		int c=20;
		int d=22;
		System.out.println(c==d);
	}

}
