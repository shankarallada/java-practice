package com.practice.wrapperclasses;

public class ShortWrapperClasses {
	public static void main(String[] args) {
		
		Short shortObj = new Short("12");
		System.out.println(shortObj.floatValue());
		System.out.println(shortObj.toString());
		System.out.println(shortObj.byteValue());
		
		//parsing
		String salary ="20000";
		short sal = Short.valueOf(salary);
		System.out.println(sal);
		
		//autoboxing
		Short num = 34;
		
		//unboxing
		short PNum = num;
		
		//camparsion
		Short s1 =23;
		Short s2 =23;
		System.out.println(s1.equals(s2));
		
		short s3 = 44;
		short s4 = 44;
		System.out.println(s3==s4);
		
		
		
	}

}
