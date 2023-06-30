package com.java.constructor;

public class ParamitizedConstructor {
	
	String name;
	Long rollNo;
	
	public ParamitizedConstructor(String name,Long rollNo) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rollNo=rollNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamitizedConstructor paramitized=new ParamitizedConstructor("Jayant",113319104032l);
		System.out.println("Name: "+paramitized.name);
		System.out.println("Roll No: "+paramitized.rollNo);
		ParamitizedConstructor paramitized2=new ParamitizedConstructor("Jayant H",1133191040321l);
		System.out.println("Name: "+paramitized2.name);
		System.out.println("Roll No: "+paramitized2.rollNo);
	}

}
