package Generics.wildcard.lowerBound;

import java.util.List;

/**
 * @author Nikhil Agrawal on 8/16/17.
 */

//Java Generics Upper Bounded Wildcard
public class GenericsWildcards {
	
	//  Java Generics Upper Bounded Wildcard
	public static void main(String[] args) {
//		List<Integer> ints = new ArrayList<>();
//		ints.add(3);
//		ints.add(5);
//		ints.add(10);
//		double sum = sum(ints);
//		System.out.println("Sum of ints=" + sum);
//
//		List<Double> doubles = new ArrayList<>();
//		doubles.add(3.92);
//		doubles.add(5.234);
//		doubles.add(10.34);
//		double sum1 = sum(doubles);
//		System.out.println("Sum of doubles=" + sum1);
	}
	
	private static void addIntegers(List<? super Number> list) {
		list.add(new Integer(50));
	}
	
	
}
