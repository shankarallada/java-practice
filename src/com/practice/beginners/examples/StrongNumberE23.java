package com.practice.beginners.examples;

import java.util.Scanner;

public class StrongNumberE23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem,fact,i,sum=0,originalnum;
		System.out.println("Enter n :");
		int num =sc.nextInt();
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
        if (sum == originalnum) {
            System.out.println(originalnum + " is STRONG NUMBER");
        } else {
            System.out.println(originalnum + " is not a STRONG NUMBER");
        }
        sc.close();
	}

}
