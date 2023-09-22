package endstreamapi4;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNum {
public static void main(String[] args) {

	List<Integer> list0 = List.of(1,2,1,1,3,4,5,6,7,6,8);
	List<Integer> list1 = list0.stream().distinct().collect(Collectors.toList());
	
	System.out.println(list0);
	System.out.println(list1);
}
}
