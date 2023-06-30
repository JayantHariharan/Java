package com.java.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderException2 {
	
	static FileReader fileReader;
	static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="J:\\eclipseworkspace\\Java\\src\\com\\java\\exception\\text2.txt";
		try {
			fileReader=new FileReader(fileName);
			reader=new BufferedReader(fileReader);
			String line;
			try {
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			}
			if(fileReader!=null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			}
		}

	}

}
