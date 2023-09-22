package thredsANDconcerncy;

public class Mythread implements Runnable{

	@Override
	public void run() {
	
		for (int i = 0; i < 11; i++) {
			System.out.println("Mythread Value=" + i);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			System.out.println(e);
			}
			
		} 
	}
	
	
	

}
