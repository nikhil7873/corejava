package in.co.inheritance;

public class Triangle {

	 private int height=0;
	 private int base =0;
	 
	 public void setHeight(int setheight, int height) {
		 this.height = height ;
	 }
	 public int getHeight() {
		 return height;
	 }
	 public void setBase (int setBase, int base) {
		 this.base = base;
	 }
	 public int getBase () {
		 return base;
	 }
	     public double area() {
	 int tArea = (getBase() * getHeight())/2;
			 System.out.println("This is area of Triangle=" +tArea);
	      return tArea;
	 }
}
