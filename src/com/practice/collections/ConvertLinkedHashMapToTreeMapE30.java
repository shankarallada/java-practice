package com.practice.collections;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 30. Write a Java program to convert a LinkedHashMap to a TreeMap.
Input:
LinkedHashMap: {C=3, A=1, B=2}
Output:
TreeMap: {A=1, B=2, C=3}
 */

public class ConvertLinkedHashMapToTreeMapE30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap linkedHashmap = new LinkedHashMap();
		linkedHashmap.put("C", 3);
		linkedHashmap.put("A", 1);
		linkedHashmap.put("B", 2);
		System.out.println("linkedHashMap: "+linkedHashmap);

		TreeMap treeMap = new TreeMap();
		treeMap.putAll(linkedHashmap);
		System.out.println("TreeMap: "+treeMap);
		sc.close();
	}

}
