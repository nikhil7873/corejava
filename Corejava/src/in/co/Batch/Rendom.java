package in.co.Batch;

public class Rendom {
	
	
	public static void main(String[] args) {
		
		
		int max =250;
		int min=60;
		int range=max-min;
		for (int i = 1; i <=7; i++) {
			
			int rd=(int)(Math.random()*range);
			System.out.println(rd);
			
			
		}
		
		
	}

}
