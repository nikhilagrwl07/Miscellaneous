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


		List<Number> doublesInFormOfNumber = new ArrayList<>();
		doublesInFormOfNumber.add(3.92);
		doublesInFormOfNumber.add(5.234);
		doublesInFormOfNumber.add(10.34);
		printData(doublesInFormOfNumber);
	}

	// ? super Integer means any class of Integer and it's super type is allowed to pass
	private static void printData(List<? super Integer> list) {
		
		list.forEach(i -> System.out.println(i));
		
		
	}
	
	
}
