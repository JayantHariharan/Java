package com.java.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public void example() {
		
		TreeSet<Integer>list=new TreeSet<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.remove(20);
		System.out.println(list);
		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		System.out.println(list);
		System.out.println(list.higher(20));
		System.out.println(list.lower(20));
		System.out.println(list.headSet(30));
		System.out.println(list.tailSet(20));
		System.out.println(list.subSet(15,40));
		System.out.println(list.descendingSet());
		System.out.println("---------------------");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("---------------------");
		Iterator<Integer>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSetExample treeSet=new TreeSetExample();
		treeSet.example();
	}

}
