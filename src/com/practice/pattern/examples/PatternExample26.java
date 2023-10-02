package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 5 5 5 5 5 
   4 5 5 5 5 
   3 4 5 5 5 
   2 3 4 5 5 
   1 2 3 4 5 
 */

public class PatternExample26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j < rows; j++)
            {
                System.out.print(j + " ");
            }

            for (int k = rows - i; k < rows; k++)
            {
                System.out.print(5 + " ");
            }
            System.out.println();
	}
        sc.close();
 }
}
