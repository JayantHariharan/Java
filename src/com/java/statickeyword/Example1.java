package com.java.statickeyword;

public class Example1 {
	
	public static void getName() {
		System.out.println("Lucifer");
	}
	public void getName(String name) {
		getName();
		System.out.println("Real Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getName();
		Example1 example=new Example1();
		example.getName("Jayant");
		

	}

}
