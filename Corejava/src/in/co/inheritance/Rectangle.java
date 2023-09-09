package in.co.inheritance;

public class Rectangle {

		   private int length = 0;
		   private int width = 0;
		   
		   public void setLength (int setLength, int length){
			   this.length =length;
		   }
		   public int getLength() {
			   return length ;
		   }
		    public void setWidth (int Width) {
		    	this.width = Width;
		    }
		    public int getWidth() {
		    	return width ;
		    }
		     public double area() {
		    	int rArea =getLength()*getWidth();
		    	System.out.println("This is rectangle Area="+rArea);
		    	return rArea;
		     }
		    
		   

		}


