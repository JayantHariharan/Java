package com.java.exception;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Jayant");
			System.out.println(Integer.parseInt("a"));
			System.out.println("Hello");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lucifer "+e);
			System.exit(0);
		}finally {
			System.out.println("Thank you");
		}
	}

}
