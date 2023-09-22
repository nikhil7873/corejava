package endstreamapi4;

import java.util.List;
import java.util.stream.Collectors;

public class Maping {
public static void main(String[] args) {
	
	List<Integer> listx = List.of(2,3,4,5,6,5,5);
	List<Integer> listy = listx.stream().map(i -> i * i).collect(Collectors.toList());
	System.out.println(listx);
	System.out.println(listy);
}
}
