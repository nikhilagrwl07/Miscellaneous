package Java8Constructs.Optional;

import java.util.Optional;

/**
 * Created by nikhilagrawal on 21/02/17.
 */
public class OptionalInJava {
	public static void main(String[] args) {
		Optional<Integer> value = Optional.empty();
		Optional<Integer> value2 = Optional.empty();
		//        Integer integer = value.get();
		//        System.out.println(integer);
		//        System.out.println(value2.orElse(3));
		System.out.println(value2.orElseGet(() -> 4));

	}
}
