package com.practice.arrays;

import java.util.Scanner;

/*
 * 19. Write a program to find the element that occurs the most in an array
	of integers and the number of times it occurs.
	Input:
	Enter the length of the array: 8
	Enter the array elements: 1 2 3 2 4 1 5 1
	Output:
	Element: 1, Occurrences: 3
 */

public class MostOccursE19 {
	public int[] getMaxOccurence(int[] arr) {
		int mostOccurenceElement=arr[0];
		int mostOccurences = 1;
		int currentElement =0;
		int currentOccurences =0;
		for(int i=0;i<arr.length;i++) {
			currentElement=arr[i];
			currentOccurences=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==currentElement) {
					currentOccurences++;
				}
			}
			if(currentOccurences>mostOccurences) {
				mostOccurenceElement=currentElement;
				mostOccurences=currentOccurences;
			}
		}
		int[] output = new int[2];
		output[0]=mostOccurenceElement;
		output[1]=mostOccurences;
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int[]array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		MostOccursE19 obj = new MostOccursE19();
		int[] arr=obj.getMaxOccurence(array);
		System.out.println("Element: "+arr[0]);
		System.out.println("occurences: "+arr[1]);
		sc.close();
	}

}
