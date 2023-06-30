package com.java.constructor;

public class ArgumentConstructor {
	
	String name;
	Long rollNo;
	
	public ArgumentConstructor() {
		// TODO Auto-generated constructor stub
		name="Jayant";
		rollNo=113319104032l;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method 

		ArgumentConstructor argument=new ArgumentConstructor();
		System.out.println("Name: "+argument.name);
		System.out.println("Roll No: "+argument.rollNo);

		
	}

}
