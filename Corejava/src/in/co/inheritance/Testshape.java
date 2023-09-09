package in.co.inheritance;

public class Testshape {
	
	public static void main(String[] args) {
		shape[]s = new shape[3];
		
		s[0]= new Rectangle():
		s[1]= new Circle();
		s[2]= new Triangle();
		
		Rectangle r =  (Rectangle) s[0];
		
		r.setLength(10);
		r.setWidth(10);
		r.area();
		
		Circle c = (Circle) s[1];
		c.setRadius(12);
		c.area();
		
		Triangle t = (Triangle) s[2];
		t.getHeight(10);
		t.setBase(15);
		t.area();
		
	}

}
