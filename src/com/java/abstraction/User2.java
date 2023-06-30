package com.java.abstraction;

public class User2 extends Room{
	
	public void hall() {
		System.out.println("Natural Theme");
	}
	
	public void kitchen() {
		System.out.println("Classical Kitchen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room room=new User2();
		System.out.println("Total Room: "+room.totalRoom);
		room.hall();
		room.kitchen();
		room.bedRoom();

	}

}
