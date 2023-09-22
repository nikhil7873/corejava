package collectionstart;



import java.util.ArrayList;
import java.util.Collection;

public class Testchalao {
	
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		
		c1.add("Name");
		c1.add(9);
		c1.add("78.8");
		c1.add("a");
		c1.add('a');
		c1.add("sir");
		c1.add('b');
		//c1.clear();
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		
		c2.add("nikhil");
		c2.add(9);
		c2.add(79.5);
		c2.add("mrs");
		c2.add("gopal");
		
		//c1.addAll(c2);
		//System.out.println(c1);
		//c1.clear();
		//System.out.println(c1);
		//methods
		
		//System.out.println(c1.contains(10));
		//System.out.println(c1.containsAll(c2));
		System.out.println(c1.remove(9));
		System.out.println(c1);
		
	}

}
