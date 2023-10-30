package com.practice.wrapperclasses;

public class CharacterWrapperClasses {
	public static void main(String[] args) {
		Character charObj = new Character('c');
		System.out.println(charObj.toString());
		System.out.println(charObj.hashCode());
		System.out.println(charObj.getClass());
		
		//parsing
		String str = "e";
		//char ch = Character.valueOf();
		//System.out.println(ch);
		
		//autoboxing
		Character ch = 'r';
		
		//unboxing
		char PCh = ch;
		
		Character ch1='t';
		Character ch2 ='t';
		System.out.println(ch1.compareTo(ch2));
		
		char ch3 = 'r';
		char ch4 = 'r';
		System.out.println(ch3!=ch4);
	}

}
