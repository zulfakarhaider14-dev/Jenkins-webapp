import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12,31,22,3,33,4,454,5,66,6,6,67,78,88,8,8,82,82);
		List<Integer> list = l.stream().filter(i->Collections.frequency(l, i)>1).collect(Collectors.toList());
		 //Set<Integer> list = l.stream().filter(i->Collections.frequency(l, i)>1).collect(Collectors.toSet());
		 
		//List<Integer> list = l.stream().distinct().collect(Collectors.toList());
		System.err.println(list);
		System.err.println("this is the new file");

	}

}
