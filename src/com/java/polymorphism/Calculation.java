package com.java.polymorphism;

public class Calculation {
	
	public void add() {
		System.out.println("Input None");
	}
	public void add(int number1,int number2) {
		System.out.println("Addition of "+number1+" and "+number2+" is "+ (number1+number2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation calculation=new Calculation();
		calculation.add();
		calculation.add(16,16);
	}

}
