package io.hard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class Testdeserialization {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ayush\\OneDrive\\Desktop\\io hard\\object.txt");
		ObjectInputStream in = new  ObjectInputStream(file);
		
		Employee1 e = (Employee1)in.readObject();
		
		System.out.println("empId="+ e.empId);
		System.out.println("Name="+ e.name);
		System.out.println("Salary="+ e.salary);
		System.out.println("BONUS="+ e.bonus);
		System.out.println("TOTAL="+ e.total);
		
		file.close();
		in.close();
	}
}
