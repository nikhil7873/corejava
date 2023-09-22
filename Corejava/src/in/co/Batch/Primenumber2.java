package in.co.Batch;

public class Primenumber2 {

	public static void main(String[] args) {
		// count
		
		int num= 83;
		int count = 0;
		
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
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
