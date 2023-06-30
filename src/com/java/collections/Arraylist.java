package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
	
	public void array() {
	    List<String>animeList=new ArrayList<String>();
		animeList.add("One Piece");
		animeList.add("Attack on Titan");
		animeList.add("Naruto");
		animeList.add("Tokyo Revengers");
		animeList.add("Tokyo Revengers");
		System.out.println(animeList);
		System.out.println(animeList.get(0));
		System.out.println(animeList.indexOf("Attack on Titan"));
		System.out.println(animeList.indexOf("Tokyo Revengers"));
		System.out.println(animeList.lastIndexOf("Tokyo Revengers"));
		
		List<String>newList=new ArrayList<String>();
		newList.addAll(animeList);
		System.out.println(newList);
		newList.clear();
		System.out.println(newList);
		newList.addAll(animeList);
		animeList.remove(3);
		System.out.println(animeList);
		animeList.add("Tokyo Revengers");
		animeList.remove("Tokyo Revengers");
		System.out.println(animeList);
		animeList.add(null);
		System.out.println(animeList);
		animeList.set(4, "Demon Slayer");
		System.out.println(animeList);
		System.out.println(animeList.isEmpty()+" "+newList.isEmpty());
		System.out.println("------- For Each -------");
		for (String string : newList) {
			System.out.println(string);
		}
		System.out.println("--------------");
		System.out.println("------- For Loop -------");
		for(Integer i=0;i<newList.size();i++) {
			System.out.println(newList.get(i));
		}
		System.out.println("--------------");
		System.out.println("------- List Iterator -------");
		ListIterator<String>listIterator=newList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("--------------");
		System.out.println("------- Iterator -------");
		Iterator<String>iterator=newList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist arrayList=new Arraylist();
		arrayList.array();

	}

}
