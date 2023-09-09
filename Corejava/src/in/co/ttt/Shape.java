package in.co.ttt;

public class Shape {
	
	private int BorderWidth= 0;
	private String Color = null;
	
	public Shape (int borderwidth, String color)  {
		
		this.BorderWidth = borderwidth;
		this.Color = color;	
	}
	  public void setBorderWidth (int borderwidth) {
		 this.BorderWidth=borderwidth;
	  }
	  public int getBorderWidth() {
		  return BorderWidth;
	  }
	  public void setColor (String color) {
		  this.Color= color;
	  }
	  public String getColor() {
		  return Color ;
	  }
	    public double area() {
	  System.out.println("This is area method");
	   return area ();
	}
}
