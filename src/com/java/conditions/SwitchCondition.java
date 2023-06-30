package com.java.conditions;

public class SwitchCondition {
	
	String heroName="Luffy";
	
	public void heroFinder() {
		switch(heroName) {
		case "Luffy":
			System.out.println("It is Monkey D Luffy");
			break;
		case "K":
			System.out.println("It is Kira");
			break;
		case "Eren":
			System.out.println("It is Eren Yeager");
			break;
		default:
			System.out.println("Till now i don't know this hero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCondition switchCondition=new SwitchCondition();
		switchCondition.heroFinder();

	}

}
