package Comperableiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class iterator {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add("hardeep");
		l.add(1);
		l.add("one");
		l.add("two");
		l.add("four");
		
		System.out.println(l);
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
