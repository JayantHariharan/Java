package com.java.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public void example() {
		HashSet<Integer>list=new HashSet<Integer>();
		list.add(11);
		list.add(22);
		list.add(10);
		list.add(15);
		list.add(22);
		list.add(null);
		list.add(30);
		System.out.println(list);
		System.out.println(list.contains(15));
		System.out.println(list.contains(20));
		System.out.println(list.remove(null)+" "+list);
		list.remove(22);
		System.out.println(list);
		list.add(21);
		System.out.println(list);
		System.out.println("-------------------");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("-------------------");
		Iterator<Integer>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSetExample hashSet=new HashSetExample();
		hashSet.example();
	}

}
