package com.practice.collections;

import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("banana");
		arrayList.add("mango");
		arrayList.add("apple");
		arrayList.add("dragonfruit");
		arrayList.add("kiwi");
		arrayList.add("orange");
		System.out.println(arrayList);
		arrayList.remove("kiwi");
		System.out.println(arrayList);
		System.out.println(arrayList.get(4));
		System.out.println(arrayList.contains("kiwi"));
		System.out.println(arrayList.isEmpty());
	}
}
