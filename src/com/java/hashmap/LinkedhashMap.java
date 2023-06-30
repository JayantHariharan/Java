package com.java.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashMap {

	
	public void example() {
		
		LinkedHashMap<Integer, String>list=new LinkedHashMap<Integer,String>();
		list.put(1,"One Piece");
		list.put(2, "Naruto");
		list.put(3, "aot");
		list.put(4,"Tokyo Revengers");
		System.out.println(list);
		System.out.println(list.keySet());
		System.out.println(list.values());
		LinkedHashMap<String, String>list2=new LinkedHashMap<String,String>();
		list2.put("One Piece", "Luffy");
		list2.put("Naruto", "Naruto");
		list2.put("Aot", "Eren Yeager");
		System.out.println(list2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedhashMap linkedHash=new LinkedhashMap();
		linkedHash.example();
	}

}
