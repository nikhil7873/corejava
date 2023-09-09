package io.hard;

import java.io.FileReader;
import java.util.Scanner;

public class scanner1 {
	
	public static void main(String[] args) throws Exception   {
		
	FileReader file = new FileReader("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\hello.txt");
	
	  Scanner sc = new Scanner(file);
	  
	  while(sc.hasNext()) {
		  
		  System.out.println(sc.nextLine());
	  }
		  sc.close();
	  
	}

}
