package com.practice.wrapperclasses;

public class ByteWrapperClasses {
	public static void main(String[] args) {
		Byte byteObj = new Byte((byte) 10);
		System.out.println(byteObj.intValue());
		System.out.println(byteObj.toString());
		System.out.println(byteObj.doubleValue());
		
		//parsing
		String salary ="20000";
		byte sal = Byte.valueOf(salary);
		System.out.println(sal);
		
		//autoboxing
		Byte age =19;
		
		//unboxing
		byte PAge = age;
		
		Byte a = 20;
		Byte b = 20;
		System.out.println(a.equals(b));
		
		byte c=22;
		byte d=22;
		System.out.println(c==d);
	}

}
