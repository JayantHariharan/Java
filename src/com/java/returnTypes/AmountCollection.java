package com.java.returnTypes;

public class AmountCollection {
	Integer amount=1000;
	
	public Integer retrieve() {
		System.out.println("Dad,I had got "+amount+" and send it to you");
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmountCollection amountCollection=new AmountCollection();
		Integer dadAmount=amountCollection.retrieve();
		System.out.println("Son, I receieved the amount "+dadAmount);
	}

}
