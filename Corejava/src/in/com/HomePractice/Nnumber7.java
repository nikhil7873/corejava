package in.com.HomePractice;

import java.util.Scanner;

public class Nnumber7 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner Sc = new Scanner(System.in);
		int range = Sc.nextInt();
		int count = 1;
		
		while (count <= range) {
		count++;
			System.out.println(count+ " " );
		}
		System.out.println("N number sucess");
	}
}
