package Java8Constructs.LambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */

// Aim of this class - Dependency Injection can be achieved by using Strategy pattern.
// In this class we are trying out different predicate for summing values of n numbers
public class StrategyPatternInJava8 {


  // In adddition to showing StrategyPatternInJava8 , this example also shows object composition + function composition
  private static Integer returnSumOfNnumberUsingSomePredicate(List<Integer> numbers, Predicate<Integer> selector){
    return  numbers.stream()
          .filter(selector)
          .reduce(0,Math::addExact);
  }

  public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    // Rule to add all numbers present in list
    System.out.println(returnSumOfNnumberUsingSomePredicate(num,e->true));

    // Rule to add all only even numbers present in list
    System.out.println(returnSumOfNnumberUsingSomePredicate(num,e-> e%2==0));


  }
}
