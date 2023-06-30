package com.java.abstraction;

public class User1 extends Room{
	
	public void hall() {
		System.out.println("Midlight Theme");
	}
	
	public void kitchen() {
		System.out.println("Modern Kitchen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room=new User1();
		System.out.println("Total Room: "+room.totalRoom);
		room.hall();
		room.kitchen();
		room.bedRoom();

	}

}
