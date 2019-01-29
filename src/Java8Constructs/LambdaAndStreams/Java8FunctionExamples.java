package Java8Constructs.LambdaAndStreams;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */
//Functions also represent a single argument function but they return a result of an arbitrary type:

public class Java8FunctionExamples {
	public static void main(String[] args) {
		
		
		Function<String, Integer> lengthofUserName = (s) -> s.length();

		Function<Integer, Boolean> isLengthNameGreaterThan4 = (x) -> x > 4;

		System.out.println(lengthofUserName.andThen(isLengthNameGreaterThan4).apply("Nikhil"));


		Function<String, Integer> stringLength = (s) -> s.length();
		Function<Integer, Boolean> lowerThanTen = (i) -> i < 10;
		Function<String, Boolean> function = stringLength.andThen(lowerThanTen);

		// Will print false
		function.apply("Hello world");

		Function<Integer, Boolean> isDivisble = (number) -> IntStream.range(2, number).noneMatch(divisor -> number % divisor == 0);
		System.out.println("IsPrime Function - " + isDivisble.apply(30));

		//Question -  Find double of first even number which is greater than 3. Please note that
		// there we can use stream , then filter and then map and then findFirst() as another way
		// to find double of first even number which is greater than 3
		Predicate<Integer> isDivisblePredicate = (x) -> (x > 3 && x % 2 == 0);

		Function<Integer, Integer> firstNumber = (x) -> IntStream.range(1, x).filter(isDivisblePredicate::test).findFirst().getAsInt();

		Function<Integer, Integer> doubleNumber = (x) -> x * 2;

		Function<Integer, Integer> result = x -> firstNumber.andThen(doubleNumber).apply(x);

		System.out.println("Double of first even number which is greater than 3  is : " + result.apply(10));


		// Sample code using both Function and Predicate. Question is finding whether a number is greater than given number
		Function<Integer, Predicate<Integer>> isGreaterThanXFunction = (pivot) -> (number -> number > pivot);
		Predicate<Integer> isGreaterThan10 = isGreaterThanXFunction.apply(10);
		Predicate<Integer> isGreaterThan20 = isGreaterThanXFunction.apply(20);
		Predicate<Integer> isGreaterThan100 = isGreaterThanXFunction.apply(100);
 	}
	
	
}

