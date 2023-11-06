package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 7.Write a program to replace all occurrences of a specific substring in an
	ArrayList of strings.
	Input:
	[Apple,Banana,Mango,Orange]
	Substring to replace: an
	New substring: **
	Output:
	ArrayList after replacing an with **:[Apple,B****a,M**go,Or**ge]
 */
public class ReplaceSubstringE7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elemenets: ");
		int size = sc.nextInt();
		System.out.println("Enter the string: ");
		ArrayList list = new ArrayList();
		for(int i=0;i<size;i++) {
			list.add(sc.next());
		}
		System.out.println(list);
		System.out.println("substring to replace: ");
		String replace=sc.next();
		System.out.println("new String: ");
		String word = sc.next();
		ArrayList list2 = new ArrayList();
		for (int j = 0; j < list.size(); j++) {
			String result = (String) list.get(j);
			String replaced = result.replace(replace,word);
			list2.add(replaced);
		}
		System.out.println(list2);
		sc.close();
		
	}

}
