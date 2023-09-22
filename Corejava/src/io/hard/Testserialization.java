package io.hard;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Testserialization {

	public static void main(String[] args) throws Exception  {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\object.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee1 e = new Employee1();
		
		e.empId = 1;
		e.name = "Nikil";
		e.salary = 10000;
		e.bonus = 2000;
		e.total = e.salary + e.bonus ;
		
		out.writeObject(e);
		file.close();
		out.close();
		System.out.println("object converted into byte stream");
		
				
	}
}
