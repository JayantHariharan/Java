package com.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedListExamples {
	
	public void list() {
		LinkedList<String>list=new LinkedList<String>();
		list.add("One Piece");
		list.add("naruto");
		list.add("aot");
		list.add(null);
		System.out.println(list);
		list.addFirst("Tokyo Revengers");
		System.out.println(list);
		list.addLast("Demon Slayer");
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.remove(0));
		System.out.println(list.removeLast());
		System.out.println(list.removeFirst());
		System.out.println(list.poll());
		System.out.println(list.pollLast());
		System.out.println(list.pollFirst());
		list.add("One Piece");
		list.add("naruto");
		list.add("One Piece");
		list.add("aot");
		list.add(null);
		list.add("naruto");
		System.out.println(list.removeFirstOccurrence("One Piece"));
		System.out.println(list);
		System.out.println(list.removeLastOccurrence("naruto"));
		System.out.println(list);
		System.out.println("---------------");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("---------------");
		for(Integer i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");
		ListIterator<String>itera=list.listIterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		while(itera.hasPrevious()) {
			System.out.println(itera.previous());
		}
		list.add(0, "One Piece");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LInkedListExamples linkedList=new LInkedListExamples();
		linkedList.list();
	}

}
