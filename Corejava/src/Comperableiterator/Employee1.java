package Comperableiterator;

public class Employee1 implements Comparable<Employee1>{

	private int empId = 0;
	private String name = null;
	private String phone = null;
	
	public Employee1(int EmpId,String name,String phone) {
		
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		}

		 
		 public void setName(String name) {
			 this.name = name ;
		 }
		 public String getName() {
			 return name;
		 }
		 public void setPhone(String phone) {
			 this.phone=phone;
		 }
		 public String getphone() {
		  return phone;
		 }
		@Override
		public int compareTo(Employee1 o) {
			
			return this.empId - o.empId;
		}
		@Override
		public String toString() {
			
			return empId+" "+name+" "+phone;
		}
		 
	
	
}
