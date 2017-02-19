package Java8Constructs;

/**
 * Created by nikhilagrawal on 19/02/17.
 */
public class OuterClass {
    int x = 10;

    public void printOuterClassName() {
        System.out.println("Class name - OuterClass");
    }

    class InnerClass {
        int y = 20;

        public void printInnnerClassName() {
//            printOuterClassName();
            System.out.println("Class name - InnerClass - ");
        }
    }
}
