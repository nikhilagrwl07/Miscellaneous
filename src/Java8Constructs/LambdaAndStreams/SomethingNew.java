package Java8Constructs.LambdaAndStreams;

import java.io.Serializable;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

@FunctionalInterface interface binOps {
	int apply(int value1, int value2);
}


@FunctionalInterface interface demoLambda {
	public int applyOperation(int x, int y);
}


/**
 * @author Nikhil Agrawal on 5/20/17.
 */
public class SomethingNew {
	public static void main(String[] args) {
		
		binOps addOPs = (x, y) -> (x + y);
		binOps MutilplyOps = (x, y) -> (x * y);
		System.out.println(addOPs.apply(10, 20));
		
		ToIntFunction<String> fun = String::length;
		System.out.println(fun.applyAsInt("Nikhil"));
		
		demoLambda integerdemoLambda = (x, y) -> (x + y);
		System.out.println(integerdemoLambda.applyOperation(10, 20));
		
		IntUnaryOperator addOneShort = x -> x + 1;
		IntUnaryOperator addOneLong = x -> {
			return x + 1;
		};
		
		
		
		Map<String, Integer> map = new HashMap<>();   // ... or any other Map class
		map.put("nikhil", 5);
		map.put("cccccc", 4);
		map.put("aaaaaa", 3);
		map.put("zzzzzz", 3);
		map.put("bbbbbbb", 2);
		
		map = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
		
		
		TreeSet<Long> ts = new TreeSet<>((Comparator<Long> & Serializable) (x, y) -> Long.compare(y, x));
		
	}
	
}
