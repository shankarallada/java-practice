package com.practice.operators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 10;
		int c = 15;
		
		boolean logicalAnd = a>b && a<c ;
		System.out.println(" a>b && a<c : "+logicalAnd);//both statements are true its gives true 
		boolean logicalOr = a>b || a>c ;
		System.out.println(" a>b || a>c : "+logicalOr);//any one statement are true its gives true
		boolean logicalXor =  a>b && a<c ;
		System.out.println(" a>b && a<c : "+ !logicalXor);//reverse the statements 
	 
	 	
	 
	}

}