package com.java.constructor;

public class ConstructorOverloading {
	
	String name;
	
	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
		name="Jayant";
	}
	
	public ConstructorOverloading(String name){
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading overLoading=new ConstructorOverloading();
		overLoading=new ConstructorOverloading("Lucifer");
		System.out.println("Name: "+overLoading.name);
		ConstructorOverloading overLoading1=new ConstructorOverloading();
		System.out.println("Name: "+overLoading1.name);

	}

}
