package com.practice.wrapperclasses;

public class DoubleWrapperClasses {
	public static void main(String[] args) {
		Double doubleObj = new Double(12.0);
		System.out.println(doubleObj.toString());
		System.out.println(doubleObj.hashCode());
		System.out.println(doubleObj.intValue());
		
		//parsing
		String salary ="9000";
		double sal = Double.valueOf(salary);
		System.out.println(sal);
		
		//autoboxing
		Double num = 33.4;
		
		//unboxing
		double PNum = num;
		
		//camparsion
		Double d1 = 22.4;
		Double d2 = 22.4;
		System.out.println(d1.equals(d2));
		
		double d3 = 33.1;
		double d4 = 33.2;
		System.out.println(d3==d4);
	}

}
