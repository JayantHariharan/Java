package com.java.polymorphism;

public class Overriding_Tenant extends Overriding_Owner{
	
	@Override
	public void hall() {
		System.out.println("It can be also used to sleep");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overriding_Owner tenant=new Overriding_Tenant();
		tenant.hall();
		tenant.kitchen();
	}

}
