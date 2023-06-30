package com.java.dataTypes;

public class Information {
	
	Long registerNo=113319104032l;
	String name="Jayant";
	Character section='A';
	
	public void getInfo() {
		System.out.println("Register No: "+registerNo);
		System.out.println("Name: "+name);
		System.out.println("Section: "+section);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information information=new Information();
		information.getInfo();

	}

}
