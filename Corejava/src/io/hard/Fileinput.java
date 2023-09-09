package io.hard;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fileinput {

	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\nikhil.jpg");
		FileOutputStream  out = new FileOutputStream ("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\gopal.jpg");
		
		int ch = in.read();
		while(ch != -1) {
			
			out.write(ch);
			ch= in.read();
		}
		in.close();
		out.close();
		
		System.out.println("data copy sucessfully");
		
		
	} 
}
