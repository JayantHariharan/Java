package com.java.conditions;

public class ElseIfCondition {
	
	String heroName="Lucifer";
	
	public void heroFinder() {
		if(heroName.equals("Thor")) {
			System.out.println("It is Thor");
		}else if(heroName.equals("Luffy")) {
			System.out.println("It is Monkey D Luffy");
		}else {
			System.out.println("It is Eren Jeager");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElseIfCondition elseCondition=new ElseIfCondition();
		elseCondition.heroFinder();

	}

}
