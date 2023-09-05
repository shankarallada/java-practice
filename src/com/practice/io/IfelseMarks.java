package com.practice.io;

import java.util.Scanner;

public class IfelseMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a studentmarks");
		int scores = sc.nextInt();
		if (scores>=90) {
			System.out.println("A grade");
		}else if (scores>=80 && scores<90) {
			System.out.println("B grade");
		}else if (scores>=70 && scores<80) {
			System.out.println("C grade");
		}else if (scores>=60 && scores<70) {
			System.out.println("D grade");
		}
		else {
			System.out.println("F grade");
		}
		sc.close();
	}

}
