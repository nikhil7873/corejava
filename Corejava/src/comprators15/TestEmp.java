package comprators15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmp {
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList();
		
		emp.add(new Employee(2,"Rohit", "22045"));
		emp.add(new Employee(7, "Shubhaman", "22014"));
		emp.add(new Employee(9, "Kohli", "22018"));
		emp.add(new Employee(12, "Kl rahul", "22001"));
		
		System.out.println(emp);
		
		Collections.sort(emp, new ComperatorbyId());
		System.out.println(emp);
		
		ArrayList<Employee>emp1= new ArrayList(emp);
		Collections.sort(emp1, new Comperatorbyname());
		
		System.out.println(emp1);
		
		
	}
}
