package collectionstart2;

public class Employee2 {
		  
		  private int id = 0;
		  private String name = null;
		  private String Address = null;
		  
		  public Employee2(int id , String name, String address) {
		
		    this.id = id;
		    this.name = name;
		    this.Address = address;
		    }
		     public void  setId (int id) {
			 this.id = id;
		  	 }
			 public int getid() {
			  return id;
			 }
			 public void setName(String name) {
				 this.name = name ;
			 }
			 public String getName() {
				 return name;
			 }
			 public void setAddress(String Address) {
				 this.Address = Address ;
			 }
			 public String getAddress() {
			  return Address  = Address;
			 }
			 
			 public String toString() {
				  return id +" "+ name+ " "+ Address;
			 }
			 
			 
			 


}

