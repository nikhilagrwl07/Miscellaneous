package Java8Constructs.InnnerClassesInJava7;

/**
 * Created by nikhilagrawal on 21/02/17.
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
