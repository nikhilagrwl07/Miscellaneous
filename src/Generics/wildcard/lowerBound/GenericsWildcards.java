package Generics.wildcard.lowerBound;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikhil Agrawal on 8/16/17.
 */

//Java Generics Upper Bounded Wildcard
public class GenericsWildcards {
	
	//  Java Generics Upper Bounded Wildcard
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		printData(ints);


		List<Number> doubles = new ArrayList<>();
		doubles.add(3.92);
		doubles.add(5.234);
		doubles.add(10.34);
		printData(doubles);
	}
	
	private static void printData(List<? super Integer> list) {
		
		list.forEach(i -> System.out.println(i));
		
		
	}
	
	
}
