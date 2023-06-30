package com.java.conditions;

public class IfCondition {
	
	Boolean isTheirDog=true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IfCondition ifCondition=new IfCondition();
		if(ifCondition.isTheirDog) {
			System.err.println("There is a Dog");
		}else {
			System.out.println("There is no Dog");
		}
	}

}
