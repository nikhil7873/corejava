package in.co.Batch;

public class Testshape {
public static void main (String[]args) {
	
	Shape s = new Shape(10,"red");
	
	s.setColor("blue");
	s.setBorderWidth(100);
	System.out.println(s.getColor());
	System.out.println(s.getBorderWidth());
}
}
