package Java8Constructs.InnnerClassesInJava7;


/**
 * Created by nikhilagrawal on 19/02/17.
 */
public class TestNestedConceptInJava {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.printInnnerClassName();

		System.out.println("Testing git of Intellij from github UI");
	}
}
