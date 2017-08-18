package Java8Constructs.LambdaAndStreams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nikhil Agrawal on 5/18/17.
 */
public class ReduceOperation {
	public static void main(String[] args) {
		List<String> family = Arrays.asList("hil", "Awal", "Ritu");
		
		final String longerName = family.stream().reduce("Steve", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		
		System.out.println(longerName);
	}
}
