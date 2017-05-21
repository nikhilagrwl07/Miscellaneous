package Java8Constructs.LambdaAndStreams;

import java.util.function.ToIntFunction;

/**
 * @author Nikhil Agrawal on 5/20/17.
 */
public class SomethingNew {
  public static void main(String[] args) {

    binOps addOPs = (x,y) -> (x+y);
    binOps MutilplyOps = (x,y) -> (x*y);
    System.out.println(addOPs.apply(10,20));

    ToIntFunction<String> fun = String::length;
    System.out.println(fun.applyAsInt("Nikhil"));
  }

}


@FunctionalInterface
 interface binOps{
  int apply(int value1, int value2);
}
