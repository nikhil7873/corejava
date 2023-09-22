package multithreading;

public class myanotherthreads extends Thread{
	
@Override
public void run() {
	
	for (int i = 10; i >= 0; i--) {
		System.out.println("Myanother threads=" +i);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	
	}
}
}
