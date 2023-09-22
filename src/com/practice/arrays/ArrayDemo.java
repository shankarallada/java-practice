package com.practice.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] scores;//array declaration
		scores = new int[5];//array instantiation
		scores[0]=80;//array initialization
		scores[1]=24;
		scores[2]=51;
		scores[3]=81;
		scores[4]=10;
		for (int score : scores) {
			//System.out.println(score);
		}
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}

	}

}
