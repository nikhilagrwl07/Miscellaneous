package Generics.wildcard.upperBound;

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
		double sum = sum(ints);
		System.out.println("Sum of ints=" + sum);
		
		List<Double> doubles = new ArrayList<>();
		doubles.add(3.92);
		doubles.add(5.234);
		doubles.add(10.34);
		double sum1 = sum(doubles);
		System.out.println("Sum of doubles=" + sum1);
	}

	// ? extends Number means all subclass class of Number is allowed to pass
	private static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
}
