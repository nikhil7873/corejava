package in.co.mornoingdeep;

public class Testcustm {


	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1= new Customer ("Gopalssss");
		Customer c2= (Customer) c1.clone();
		
		c2.name = "nikhil";
		c2.a.balance = 50000;
		
		System.out.println("orignal");
		System.out.println("NAME="+ c1.name);
		System.out.println("balance="+c1.a.balance);
		
		
		System.out.println("Duplicate ");
		System.out.println("NAME="+ c2.name);
		System.out.println("Balance ="+ c2.a.balance);
				
	}
}

