package com.java.statickeyword;

public class StaticVariables {
	
	String realName;
	static String nickName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariables id_1=new StaticVariables();
		id_1.realName="Monkey D Luffy";
		id_1.nickName="Straw Hat";
		System.out.println("Name: "+id_1.realName+"  NickName: "+id_1.nickName);
		StaticVariables id_2=new StaticVariables();
		id_2.realName="Lucifer";
		id_2.nickName="Devil";
		System.out.println("Name: "+id_1.realName+"  NickName: "+id_1.nickName);
		System.out.println("Name: "+id_2.realName+"  NickName: "+id_2.nickName);
		
	}

}
