package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 17. Write a program to find the sum of even and odd numbers up to a given limit.
 * Input:
 * Enter a limit: 10
 * Output:
 * The sum of even numbers up to 10 is: 30
 * The sum of odd numbers up to 10 is: 25
 */

public class SumEvenOddNumbersE17 {
	public boolean isEvenoddsum(int num) {
		int i;
		for ( i = 1; i <=num; i++) {
			if (i % 2 == 0) {
			}
			}
		return i==0;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit : ");
		int num = sc.nextInt();
		int i = 1, evensum = 0, oddsum = 0;
		SumEvenOddNumbersE17 obj = new SumEvenOddNumbersE17();
		//for (i = 1; i <=num; i++) {
		//	if (obj.isEvenoddsum(num)) {
				evensum = evensum + i;
			//} else {
				oddsum = oddsum + i;
			}
			//}
	//	System.out.println("the sum of even numbers upto " + num + " is : " + evensum);
		//System.out.println("the sum of odd numbers upto " + num + " is : " + oddsum);
		//sc.close();
	}

//}
