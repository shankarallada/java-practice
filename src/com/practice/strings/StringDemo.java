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
		//System.out.println(name8.substring(17));//mention start index
		//System.out.println(name8.substring(12));
		//System.out.println(name8.substring(0, 11));//mention both start and end index
		
		//7.searching
		//System.out.println(name8.indexOf("shiva")>0);
		//System.out.println(name8.contains("shiva"));

		//8.splitting
		String name9= "Shiva@Shankar@Talapatra";
	    String[] names=name9.split("@");
		for (String na : names) {
			//System.out.print(na);
		}


		//9.UPPER CASE & LOWER CASE
		String upper=name9.toUpperCase();
		String lower=name9.toLowerCase();
		//System.out.println(upper);
		//System.out.println(lower);

		//10.trimming
		String tr=name9.trim();
		//System.out.println(tr);

		//11.Start or End
		boolean isStart=name9.startsWith("Sh");
		//System.out.println(isStart);
		boolean isEnd=name9.endsWith("tra");
		//System.out.println(isEnd);

		//12.char at
		char ch=name9.charAt(5);
		//System.out.println(ch);
	}

}
