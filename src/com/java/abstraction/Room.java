package com.java.abstraction;

public abstract class Room {
	
	int totalRoom=3;

	public abstract void hall();
	
	public abstract void kitchen();

	public void bedRoom() {
		System.out.println("Classic BedRoom");
	}
}
