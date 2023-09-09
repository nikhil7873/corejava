package io.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReader1 {
    
	public static void main(String[] args) throws Exception {
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(isReader);
		
		PrintWriter out = new PrintWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\shubh.txt");
		
		String line = in.readLine();
		
		while (!(line.equals("bye"))) {
			
			out.println(line);
			out.println();
			}
		
		
	}
}
