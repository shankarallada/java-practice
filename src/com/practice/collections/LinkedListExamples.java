package com.practice.collections;

import java.util.LinkedList;

public class LinkedListExamples {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		System.out.println(linkedList);
		linkedList.remove(1);
		System.out.println(linkedList);
		System.out.println(linkedList.get(3));
		System.out.println(linkedList.contains(300));
		System.out.println(linkedList.isEmpty());
	}

}
