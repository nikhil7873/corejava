package collectionstart2;
import java.util.ArrayList;
import java.util.Iterator;

import io.hard.Employee1;


public class Testemployee {

		public static void main(String[] args) {
			
			Employee2 e1 = new Employee2(1,"hardeeep","kota");
			
			ArrayList list = new ArrayList ();
			list.add(e1);
			
			Employee2 e = (Employee2) list.get(0);
			
			System.out.println(e.getid());
			System.out.println(e.getName());
			System.out.println(e.getAddress());
			
    for (int i = 0; i < list.size(); i++) {
		Employee2 e2 = (Employee2) list.get(i);
		System.out.println(e2);
	
	}
   for (Object object : list) {
		Employee2 e2 = (Employee2) object;
		System.out.println(e2);
	}
      Iterator it = list.iterator();
    
        while (it.hasNext()) {
    	System.out.println(it.next());
    }
		
	}
 }


