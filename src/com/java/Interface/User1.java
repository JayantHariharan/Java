package com.java.Interface;

public class User1 extends Owner implements Room {
	
	public void hall() {
		System.out.println("This is hall");
	}
	
	public void kitchen() {
		System.out.println("This is Kitchen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User1 user1=new User1();
		System.out.println("Name: "+user1.name+" Phone: "+user1.phoneNumber);
		user1.eBill();
		user1.hall();
		user1.kitchen();
		System.out.println("-------------------------------------");
		Owner user=new User1();
		System.out.println("Name: "+user.name+" Phone: "+user.phoneNumber);
		user.eBill();
		System.out.println("-------------------------------------");
		Room room=new User1();
		room.hall();
		room.kitchen();
	}

}
