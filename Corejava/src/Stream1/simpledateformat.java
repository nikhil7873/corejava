package Stream1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateformat {
public static void main(String[] args) {
	
     Date date = new Date();
     
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     String str = sdf.format(date);
     System.out.println(str);
	
}
}
