package Java8Constructs.LambdaAndStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Streams {
	
	public static void main(String[] args) {

		List<String> strList = Arrays.asList("defg", "abc", "", "bcd", "", "jk", "jk");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.printf("List %s has %d empty strings %n", strList, count);
		
		ArrayList<String> listToArrayList = strList.parallelStream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("listToArrayList = " + listToArrayList);
		
		TreeSet<String> listToTreeSet = strList.parallelStream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println("listToTreeSet = " + listToTreeSet);
		
		long num = strList.stream().filter(x -> x.length() > 3).count();
		System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
		
		count = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.printf("List %s has %d with letter a %n", strList, count);
		
		Set<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toSet());
		System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
		
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada", "USA");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);
		
	}
}
