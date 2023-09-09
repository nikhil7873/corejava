package in.co.Batch;

public class Atm {
	private int balance = 0;
	
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public int getbalance() {
		return balance ;
	}
	public void  deposit (int amt) {
		int total = getbalance()+ amt;
		setbalance(total);
		
		System.out.println( "Balance after deposite="+getbalance());
	}
	 public void withdraw (int amt) {
		
		 int total= getbalance()-amt;
		 if(total<2000) {
			 System.out.println("Insufficent Balance!!!!!");
		 }
		  else {
			  setbalance(total);
			  System.out.println("Balance after withdraw="+ -getbalance());
		  }
		
	 } 
	

}
