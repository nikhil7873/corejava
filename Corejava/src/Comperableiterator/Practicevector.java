package Comperableiterator;

import java.util.Enumeration;
import java.util.Vector;

public class Practicevector {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("one");
		v.add(1);
		v.add(2);
		v.add(3);
		v.add("four");
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		v.add("hardeep");
		v.add("shivam");
		v.add("nikhil");
		v.add("gopal");
		
		System.out.println(v);
		
	    while(e.hasMoreElements()) {
	    	System.out.println(e.nextElement());
	    }
	}

}
