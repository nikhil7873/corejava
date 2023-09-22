package Stream1;

import java.util.Calendar;
import java.util.Date;

public class calender {
public static void main(String[] args) {
	
    Calendar Cal = Calendar.getInstance();
    Cal.add(Calendar.DATE,11);
    
    Date date = Cal.getTime();
    System.out.println(date);
}
}
