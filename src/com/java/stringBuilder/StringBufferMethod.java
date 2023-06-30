package com.java.stringBuilder;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder name=new StringBuilder("Jayant");
		StringBuilder insert=new StringBuilder("Jayant");
		System.out.println("String Buffer: "+name.append(" Lucifer"));
		name=new StringBuilder("Lucifer");
		System.out.println(name+"_"+"025 "+name.append("_025"));
		System.out.println("Replace: "+name.replace(0, 7, "Jayant"));
		System.out.println("Delete: "+name.delete(0, 6));
		System.out.println("Insert: "+name.insert(0,"Lucifer"));
		System.out.println("Capacity: "+name.capacity());
		System.out.println("Reverse: "+name.reverse());
		System.out.println("Length: "+name.length());

	}

}
