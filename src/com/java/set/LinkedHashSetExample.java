package com.java.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public void example() {
		
		LinkedHashSet<Integer>list=new LinkedHashSet<Integer>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(40);
		System.out.println(list);
		list.add(10);
		System.out.println(list);
		list.remove(10);
		System.out.println(list);
		LinkedHashSet<Integer>list2=new LinkedHashSet<Integer>();
		list2.addAll(list);
		System.out.println(list2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSetExample linkedHash=new LinkedHashSetExample();
		linkedHash.example();
	}

}
