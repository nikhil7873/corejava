package io.hard;

import java.io.FileWriter;

public class FileWriter1 {

	public static void main(String[] args) throws Exception {
		
FileWriter writer= new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\gopal.txt");


		  
		  writer.write("hello i am gopal");
    writer.write ("i am a java developer");
	
	writer.close(); 
	System.out.println("data write successfully");
		
	}

	
		
	}

