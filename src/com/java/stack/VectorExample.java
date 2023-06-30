package com.java.stack;

import java.util.Vector;

public class VectorExample {
	
	public void example() {
		Vector<String>list=new Vector<String>();
		list.addElement("One Piece");
		list.addElement("Naruto");
		list.addElement("aot");
		list.addElement(null);
		list.addElement("null");
		System.out.println(list);
		list.removeElement("null");
		System.out.println(list);
		list.removeAllElements();
		System.out.println(list);
		list.addElement("One Piece");
		list.addElement("Naruto");
		list.addElement("aot");
		list.addElement(null);
		list.addElement("null");
		System.out.println(list.firstElement());
		System.out.println(list.lastElement());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VectorExample vector=new VectorExample();
		vector.example();
	}

}
