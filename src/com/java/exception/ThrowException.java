package com.java.exception;

public class ThrowException {
	
	public void getInfo() {
		try {
			throw new InfoException("Can't able to retrieve info");
		}catch(InfoException e) {
			//e.printStackTrace();
			System.out.println("Due to server load");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException exception=new ThrowException();
		exception.getInfo();
	}

}
