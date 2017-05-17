package Java8Constructs.LambdaAndStreams;

import java.util.concurrent.Callable;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */
public class SingleAbstractMethodDesignPatternJava8 {

  public static void main(String[] args) {

    Callable<String> callableHelloWorld = () -> "hello World !!!";
    try {
      System.out.println(callableHelloWorld.call());
    } catch (Exception e) {
      e.printStackTrace();
    }

    Runnable runnable = () -> System.out.println("Print Hello !!");
    runnable.run();
  }
}
