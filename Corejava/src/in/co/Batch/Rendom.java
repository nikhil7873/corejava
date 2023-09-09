package in.co.Batch;

public class Rendom {
	
	
	public static void main(String[] args) {
		
		
		int max =500;
		int min=150;
		int range=max-min;
		for (int i = 0; i <=5; i++) {
			
			int rd=(int)(Math.random()*range);
			System.out.println(rd);
			
			
		}
		
		
	}

}
