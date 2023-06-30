package com.java.exception;

public class NumberException {
	
	public void add() {
		try {
			Integer number1=3;
			Integer number2=0;
			Integer result=number1/number2;
			System.out.println("Result: "+result);
		}catch(ArithmeticException e) {
			System.out.println("Infinity "+e);
		}catch(Exception e) {
			System.out.println("Math is Puzzle");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberException number=new NumberException();
		number.add();

	}

}
