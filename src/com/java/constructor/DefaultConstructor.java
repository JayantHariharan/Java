package com.java.constructor;

public class DefaultConstructor {
	
	String name;
	
	public void getName() {
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor defaultConstructor=new DefaultConstructor();
		defaultConstructor.getName();
	}

}
