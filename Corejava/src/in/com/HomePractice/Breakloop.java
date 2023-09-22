package in.com.HomePractice;

public class Breakloop {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		    }
		System.out.println("i am break for loops");
	}
}
