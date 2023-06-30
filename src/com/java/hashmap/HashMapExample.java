package com.java.hashmap;

import java.util.HashMap;

public class HashMapExample {
	
	public void example() {
		HashMap<Integer, String>list=new HashMap<Integer,String>();
		list.put(1, "One Piece");
		list.put(2,"Naruto");
		list.put(3, "aot");
		list.put(4,"One Piece");
		list.put(1, "Tokyo Revengers");
		System.out.println(list);
		list.put(1,"One Piece");
		System.out.println(list);
		
		HashMap<Integer, String>list1=new HashMap<Integer,String>();
		list1.putAll(list);
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		System.out.println(list.containsKey(1));
		System.out.println(list.containsValue("Naruto"));
		System.out.println(list.containsKey(6));
		System.out.println(list.containsValue("Tokyo Revengers"));
		System.out.println(list.clone());
		System.out.println(list.isEmpty());
		System.out.println(list1.isEmpty());
		System.out.println(list.keySet());
		System.out.println(list1.keySet());
		System.out.println(list.get(3));
		System.out.println(list.values());
		System.out.println(list.entrySet());
		HashMap<String, String>list2=new HashMap<String,String>();
		list2.put("One Piece", "Luffy");
		list2.put("Naruto", "Naruto");
		list2.put("Aot", "Eren Yeager");
		System.out.println(list2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapExample hashMap=new HashMapExample();
		hashMap.example();

	}

}
