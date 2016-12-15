package Java8Constructs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by z002cww on 12/15/16.
 */
public class Java8Streams {

  public static void main(String[] args) {
    List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
    long count = strList.stream().filter(x -> x.isEmpty()).count();
    System.out.printf("List %s has %d empty strings %n", strList, count);


    long num = strList.stream().filter(x -> x.length()> 3).count();
    System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

    count = strList.stream().filter(x -> x.startsWith("a")).count();
    System.out.printf("List %s has %d with letter a %n", strList, count);

    List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
    System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);

    List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
    String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
    System.out.println(G7Countries);

  }
}
