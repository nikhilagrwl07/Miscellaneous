package Java8Constructs.GenericsAndCollectionsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Nikhil Agrawal on 3/1/17.
 */
public class ListsExample {

	/*
	The static method toList accepts an array of type T[] and returns a list of type List<T>,
	and does so for any type T. This is indicated by writing <T> at the beginning of the method
	\signature, which declares T as a new type variable. A method which declares a type variable
	in this way is called a generic method. The scope of the type variable T is local to the method itself;
	it may appear in the method signature and the method body, but not outside the method.

	 */
	@SafeVarargs private static <T> List<T> convertArrayToList(T... arr) {
		List<T> list = new ArrayList<T>();
		for (T t : arr) {
			list.add(t);
		}
		return list;
	}

	public static void main(String[] args) {
		//At run-time, the arguments are packed into an array which is passed to the method, just as previously.
		List<Number> nums = new ArrayList<Number>();
		nums.add(2);
		nums.add(3.14);
		System.out.println(nums);

		List<Number> numsList = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> dbls = Arrays.asList(2.78, 3.14);
		numsList.addAll(ints);
		numsList.addAll(dbls);
		//    System.out.println(numsList);
		assert numsList.toString().equals("[1, 2, 2.78, .14]");


		List<Integer> integers = ListsExample.convertArrayToList(1, 2, 3);
		List<String> strings = ListsExample.convertArrayToList("Nikhil", "Ritu", "Priya");

		System.out.println(strings);
		System.out.println(integers);

	}
}
