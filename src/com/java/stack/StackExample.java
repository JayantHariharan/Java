package com.java.stack;

import java.util.Stack;

public class StackExample {
	
	public void example() {
		Stack<String>list=new Stack<String>();
		list.push("One Piece");
		list.push("Naruto");
		list.push("aot");
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		list.add("aot");
		System.out.println(list.search("One Piece"));
		System.out.println(list.search("Demon Slayer"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackExample stack=new StackExample();
		stack.example();
	}

}
