package com.java.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Jayant";
		name="Lucifer";
		System.out.println("Name: "+name);
		
		System.out.println("First Character in my name: "+name.charAt(0));
		
		System.out.println("Length of my name: "+name.length());
		
		System.out.println("Equals: "+name.equals("LUCIFER"));
		
		System.out.println("EqualsIgnoreCase: "+name.equalsIgnoreCase("LUCIFER"));
		
		System.out.println("Is Empty: "+name.isEmpty());
		
		System.out.println("Contains: "+name.contains("Luc"));
		
		System.out.println("Substring: "+name.substring(1));
		
		System.out.println("Substring: "+name.substring(0, 4));
		
		System.out.println("Concat: "+name.concat(" Jayant"));
		
		System.out.println("Replace: "+name.replace('e', 'a'));
		
		System.out.println("Replace: "+name.replace("Lucifer", "Jayant"));
		
		name="Jayant";
		
		System.out.println("Index Of: "+name.indexOf('a'));
		
		System.out.println("Index Of: "+name.indexOf('a', 2));
		
		System.out.println("Index Of: "+name.indexOf("yan"));
		
		System.out.println("Index Of: "+name.indexOf("ay",1));
		
		name=" Jayant ";
		System.out.println("Before Trim: "+name);
		System.out.println("Trim: "+name.trim());
		
		Integer value=16;
		String number=String.valueOf(value);
		System.out.println("String Value: "+number);
		
		System.out.println("UpeerCase: "+name.toUpperCase());
		
		System.out.println("LowerCase: "+name.toLowerCase());
		
		System.out.println("Join: "+String.join("/","25","07","2002"));
		
		String sentence="Lucifer is good";
		String sarr[]=sentence.split(" ");
		for (String string : sarr) {
			System.out.println(string);
		}
		
		

	}

}
