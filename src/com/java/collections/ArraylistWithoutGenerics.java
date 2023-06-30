package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistWithoutGenerics {
	
	public void array() {
		List anime=new ArrayList();
		anime.add("One Piece");
		anime.add("Naruto");
		System.out.println(anime);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraylistWithoutGenerics arrayList=new ArraylistWithoutGenerics();
		arrayList.array();

	}

}
