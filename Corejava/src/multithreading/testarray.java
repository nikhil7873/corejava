package multithreading;

import java.util.Scanner;

public class testarray {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			{	
			int x=sc.nextInt();
	    for (int j = 0; j < number.length; j++) {
		    System.out.println(number[i]);	
	
		    if (number[i]==x) ;
		    	System.out.println("index of value=" + i);
				
			}
	    }
	
		}
	}
}

