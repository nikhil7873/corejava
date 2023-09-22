package thredsANDconcerncy;

public class TestThrd {

	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		Thread tr = new Thread(t1);
		
		tr.start();
	}
}
