/*
    Problem -
    Solution -
    Time Complexity -
    Space Complexity -
 */


package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreamPractice {
    public static void main(String[] args) {


        List<Integer> input = Arrays.asList(1, 2, 3, 4, 2, 4, 1, 5, 6, 3);

        Predicate<Integer> isEven = integer -> integer % 2 == 0;
        Optional<Integer> sum = input.stream().distinct().filter(isEven)
                                        .reduce((integer, integer2) -> integer+integer2);


        System.out.println(sum.get());
        //distinctElements.forEach(System.out::println);

    }


}
