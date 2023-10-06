package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 23. Write a program to check if a given number is a strong number or not.
	A Strong number is a number, where the sum of the factorial of the
	digits is equal to the number itself. 1, 2, 145, and 40585 are some
	examples of Strong numbers.
	Input1:
	Enter n: 145
	Output1:
	145 is a strong number.
	Input2:
	Enter n: 140
	Output2:
	140 is not a strong number.
 */

public class StrongNumberE23 {
	public boolean numberStrong(int num) {
		int rem,fact,i,sum=0,originalnum;
		originalnum=num;
        while (num>0)
        {
            rem=num%10;
            fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;//fact=fact*i
            }
            sum+=fact;
            num=num/10;
        }
		return sum==originalnum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n :");
		int num =sc.nextInt();
		StrongNumberE23 obj = new StrongNumberE23();
        if (obj.numberStrong(num)) {
            System.out.println(num + " is STRONG NUMBER");
        } else {
            System.out.println(num + " is not a STRONG NUMBER");
        }
        sc.close();
	}

}
