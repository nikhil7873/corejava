package Comperableiterator;

import java.util.ArrayList;
import java.util.Collections;

public class Sortcollect {
public static void main(String[] args) {
	
	ArrayList<Integer>marks = new ArrayList();
	marks.add(100);
	marks.add(99);
	marks.add(55);
	marks.add(45);
	marks.add(36);
	
	System.out.println(marks);
	
	Collections.sort(marks);
	System.out.println(marks);
}
}
