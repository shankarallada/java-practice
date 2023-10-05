package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 	1 2 3 4 5 
	2 3 4 5 1 
	3 4 5 1 2 
	4 5 1 2 3 
	5 1 2 3 4
 */

public class PatternExample34 {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to print the pattern ");

        int rows = sc.nextInt();        
        for (int i = 1; i <= rows; i++)
        {
            int j = i;
            
            for (int k = 1; k <= rows; k++) 
            { 
                System.out.print(j + " "); 
                j++; 
                if (j > rows)
                    j = 1;
            }
            System.out.println();
        }
        sc.close();
    }
}
