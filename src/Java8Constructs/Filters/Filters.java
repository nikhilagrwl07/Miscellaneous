package Java8Constructs.Filters;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by nikhilagrawal on 21/02/17.
 */
public class Filters {
	public static void main(String[] args) {
		Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		Integer[] integers = Arrays.stream(nums).filter(n -> n % 2 == 0).filter(n -> n > 3).toArray(Integer[]::new);
		Stream.of(integers).forEach(System.out::println);
	}
}
