package com.java.polymorphism;

public class Overloading_User {
	
	public void description(Overloading_Hall content) {
		System.out.println("This is Hall");
	}
	
	public void description(Overloading_Kitchen content) {
		System.out.println("This is Kitchen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading_User user=new Overloading_User();
		Overloading_Hall hall=new Overloading_Hall();
		Overloading_Kitchen kitchen=new Overloading_Kitchen();
		user.description(hall);
		user.description(kitchen);
		

	}

}
