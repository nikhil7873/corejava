package Comperableiterator;

import java.util.ArrayList;
import java.util.Collections;

public class Testemp {
	
	public static void main(String[] args) {
		
		ArrayList<Employee1> e1 = new ArrayList<Employee1>();
	
		e1.add(new Employee1(4 ,"shubham","5500"));
		e1.add(new Employee1(8 ,"gopal","4580"));
		e1.add(new Employee1(6 ,"sagar","7844"));
		e1.add(new Employee1(11 ,"nikhil","5425"));
		
		System.out.println(e1);
		Collections.sort(e1);
		System.out.println(e1);
	}

}
