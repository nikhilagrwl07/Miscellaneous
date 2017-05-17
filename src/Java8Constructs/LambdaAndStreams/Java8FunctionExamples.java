package Java8Constructs.LambdaAndStreams;

import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */
//Functions also represent a single argument function but they return a result of an arbitrary type:

public class Java8FunctionExamples {
  public static void main(String[] args) {


    Function<String, Integer> lengthofUserName = (s) -> s.length();
    //    System.out.println(lengthofUserName.apply("Nikhil"));

    Function<Integer, Boolean> isLengthNameGreaterThan4 = (x) -> x > 4;

    System.out.println(lengthofUserName.andThen(isLengthNameGreaterThan4).apply("Nikhil"));


    Function<String, Integer> stringLength = (s) -> s.length();
    Function<Integer, Boolean> lowerThanTen = (i) -> i < 10;
    Function<String, Boolean> function = stringLength.andThen(lowerThanTen);

    // Will print false
    function.apply("Hello world");

    Function<Integer, Boolean> isDivisble = (number) -> IntStream.range(2, number).noneMatch(divisor -> number % divisor == 0);
    System.out.println("IsPrime Function - " + isDivisble.apply(30));

  }


}

