package com.practice.beginners.examples;

import java.util.Scanner;

/*
 * 14. Write a program to print the first n prime numbers
 * Input:
 * Enter the value of n: 7
 * Output:
 * 2 3 5 7 11 13 17
 */
public class PrimeNumberN14 {
	public void numberPrime(int n) {
		int count = 0;
		int num = 2;
		boolean isPrime = false;
		while (count < n) { //0<n,1<n,2<n,......,n<n
			isPrime = true; //we are assuming current num is prime number
			for (int i = 2; i < num; i++) { //num=7,i=2,3,4,5,6,7
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num+" ");
				count++;
			}
			num++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		// 2->1,2->p
		// 3->1,3->p
		// 4->1,2,4->Np
		PrimeNumberN14 obj = new PrimeNumberN14();
		obj.numberPrime(n);
		sc.close();
	}

}
