package io.hard;

import java.io.FileReader;
public class Filereader1 {

	public static void main(String[] args) throws Exception {
		
	FileReader reader = new FileReader ("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\Hello");
	
		int  ch = reader.read();
	
	   while (ch !=-1) {
		 
		   System.out.print(ch);
		   ch= reader.read();
		  
	   }
	   reader.close();
	
	}
}
