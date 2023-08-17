package in.co.Batch;

public class Shape {

	private int borderwidth = 0;
	private String color = null;
	
	public Shape() {
		
	}
	public Shape (int borderWidth, String Color) {
	
		this.borderwidth = borderwidth;
		this.color = color;	
	}
	  public void setBorderWidth (int borderWidth) {
		 this.borderwidth=borderwidth;
	  }
	  public int getBorderWidth() {
		  return borderwidth;
	  }
	  public void setColor (String color) {
		  this.color= color;
	  }
	  public String getcolor() {
		  return color ;
	  }
}
