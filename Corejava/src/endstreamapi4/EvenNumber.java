package endstreamapi4;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
public static void main(String[] args) {
	
	List<Integer> list = List.of(2,3,5,4,8,5,6,5,5);
	List<Integer> list1 = list.stream().filter(i->i % 2 == 0).collect(Collectors.toList());
	System.out.println(list);
	System.out.println(list1);
}
}
