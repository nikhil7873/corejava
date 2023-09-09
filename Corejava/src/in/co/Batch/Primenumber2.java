package in.co.Batch;

public class Primenumber2 {

	public static void main(String[] args) {
		// count
		
		int num= 81;
		int count = 0;
		
		for (int i = 1; i < num; i++) {
			if (num%2==0) {
			count++;	
			}
			
		}
		if (count==0) {
			System.out.println("Prime number");
		}
		else
			System.out.println("not prime number");

	}

}
