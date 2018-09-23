package Generics.miscellanous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Nikhil Agrawal on 10/11/17.
 */
public class VarargsExmaple {
	public static void main(String[] args) {
		
		List<Integer> ints = asList(1, 2, 3);
		List<String> words = asList("hello", "world");
		
		ints.forEach(i -> System.out.println(i));
		words.forEach(i -> System.out.println(i));
		
		List<String> resultList = new ArrayList<>();
		
		addAll(resultList, "hello", "world");
		resultList.forEach(i -> System.out.println(i));
		
	}
	
	@SafeVarargs
	private static <E> List<E> asList(E... arr) {
		List<E> list = new ArrayList<E>();
		Collections.addAll(list, arr);
		return list;
	}
	
	@SafeVarargs
	private static <E> void addAll(List<E> list, E... arr) {
		Collections.addAll(list, arr);
	}
}
