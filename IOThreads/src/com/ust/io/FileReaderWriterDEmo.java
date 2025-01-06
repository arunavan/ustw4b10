package com.ust.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDEmo {

	public static void main(String[] args) throws IOException {
		
		FileReader f1=new FileReader("C:\\Javatraining\\readme.txt");
		BufferedReader b1=new BufferedReader(f1);
		FileWriter f2=new FileWriter("C:\\Javatraining\\out1.txt");
		BufferedWriter b2=new BufferedWriter(f2);
		String line=null;
		while((line=b1.readLine())!=null) {
			System.out.print(line);
			b2.write(line);
		}
		f1.close();
		b1.close();
		b2.close();
		f2.close();
	}

}