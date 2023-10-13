package com.practice.pattern.examples;

import java.util.Scanner;
/*
 * 6.Print a pyramid pattern of stars using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 	*
   ***
  *****
 *******
*********
formula : stars= 2*n+1=1,3,5,7,9,11,13,15,17......
spaces =n-1-i->5-1-0=4->5-1-1=3->5-1-2=2->5-1-3=1->5-1-4=0
1-> i=0, j=0 to 4-> 4 spaces + 1 star
2-> i=1, j=0 to 3-> 3 spaces + 3 stars
3-> i=2, j=0 to 2-> 2 spaces + 5 stars
4-> i=3, j=0 to 1-> 1 space  + 7 stars
5-> i=4, j=0 to 0-> 0 space  + 9 stars
 */

public class PyramidE6 {
	public void starPyramid(int n) {
		for (int i = 0; i < n; i++) {// Navigate to next line
			for (int j = 0; j < n - 1 - i; j++) {// print spaces
				System.out.print(" ");// print spaces in same row
			}
			for (int k = 0; k < 2 * i + 1; k++) {// print stars in same line
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		PyramidE6 obj = new PyramidE6();
		obj.starPyramid(n);		
		sc.close();
	}

}
