package com.java.hashmap;

import java.util.TreeMap;

public class Treemap {

	public void example() {
		
		TreeMap<Integer, String>list=new TreeMap<Integer,String>();
		list.put(3, "aot");
		list.put(1,"One Piece");
		list.put(2,"Naruto");
		System.out.println(list);
		System.out.println(list.firstEntry());
		System.out.println(list.lastEntry());
		System.out.println(list.firstKey());
		System.out.println(list.lastKey());
		System.out.println(list.pollFirstEntry());
		System.out.println(list.pollLastEntry());
		System.out.println(list);
		list.put(3, "aot");
		list.put(1,"One Piece");
		list.put(2,"Naruto");
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.remove(2,"Naruto"));
		System.out.println(list);
		list.put(3, "aot");
		list.put(1,"One Piece");
		list.put(2,"Naruto");
		list.put(4, null);
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treemap treeMap=new Treemap();
		treeMap.example();
	}

}
