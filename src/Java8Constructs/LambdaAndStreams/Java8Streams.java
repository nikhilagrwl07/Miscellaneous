package Java8Constructs.LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z002cww on 12/15/16.
 */
public class Java8Streams {

  public static void main(String[] args) {

    Employee e1 = new Employee(1,1000);
    Employee e2= new Employee(2,2000);
    Employee e3= new Employee(3,3000);
    Employee e4= new Employee(4,4000);
    Employee e5= new Employee(5,5000);
    Employee e6= new Employee(6,6000);

    List<Employee> employeeList = new ArrayList<Employee>(){{
      add(e1);
      add(e2);
      add(e3);
      add(e4);
      add(e5);
      add(e6);
    }};
//    List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
//    long count = strList.stream().filter(x -> x.isEmpty()).count();
//    System.out.printf("List %s has %d empty strings %n", strList, count);
//
//
//    long num = strList.stream().filter(x -> x.length()> 3).count();
//    System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
//
//    count = strList.stream().filter(x -> x.startsWith("a")).count();
//    System.out.printf("List %s has %d with letter a %n", strList, count);
//
//    List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
//    System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
//
//    List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
//    String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
//    System.out.println(G7Countries);

  }
}
