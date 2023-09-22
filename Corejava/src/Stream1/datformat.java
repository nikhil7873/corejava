package Stream1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datformat {
public static void main(String[] args) throws ParseException {
	
	String str = "18/09/2023";
	SimpleDateFormat Sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = Sdf.parse(str);
	
	System.out.println(date);
}
}
