package Java8Constructs;

/**
 * Created by nikhilagrawal on 19/02/17.
 */
public class TestNestedConceptInJava {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printInnnerClassName();

    }
}
