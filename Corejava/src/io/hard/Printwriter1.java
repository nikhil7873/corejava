package io.hard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter1 {
public static void main(String[] args) throws IOException {
	
	FileWriter file = new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\gopal.txt");
	
	PrintWriter out = new PrintWriter(file);
	out.println("i am gopal");
	out.println("he isnplaced in amazon ");
	
	out.println("now");
	
	file.close();
	out.close();
	System.out.println("data write successfully");
}

}
