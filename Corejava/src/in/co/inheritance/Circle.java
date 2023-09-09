package in.co.inheritance;
public extends class Circle {
	
	private int radius = 0;
	private double PI = 3.14;
	
	
	public void setRadius (int radius) {
	this.radius = radius;
	}
	public int getradius() {
		return radius;
	}
	public  void area1() {
	}	
	public double area() {
		 double tArea = PI * getradius() * getradius();
				 System.out.println("This is Triangle area =" +tArea);
		      return tArea;
	   }
	   
	   
	
}
	
