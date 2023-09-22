package endstreamapi4;

import java.util.List;
import java.util.stream.Collectors;

public class StartWithS {
public static void main(String[] args) {
	
	List<String>name = List.of("hardeep","shubham","gopal","sagar","sachin","deeep");
	List<String>newname = name.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
	
	System.out.println(name);
	System.out.println(newname);
			
}
}
