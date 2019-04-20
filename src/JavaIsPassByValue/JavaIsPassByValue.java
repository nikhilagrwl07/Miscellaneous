package JavaIsPassByValue;

/**
 * @author nikhil.agrawal
 */
public class JavaIsPassByValue {

    public static void main(String[] args) {

        // For objects
        Dog d = new Dog("Max");

        if (d.getName().equalsIgnoreCase("MAX")) {
            System.out.println("Inside MAX");
        }

        // Here object reference is passed by value
        modifyingCustomObjectType(d);


        if (d.getName().equalsIgnoreCase("MAX")) {
            System.out.println("Inside MAX");
        }


        // For primitive types
        int a = 10;
        int b;
        b = a;

        System.out.println("Before modifying a = " +a);
        System.out.println("Before modifying b = " +b);

        a = 20;

        System.out.println("After modifying a = " +a);
        System.out.println("After modifying b = " +b); // b still have value 10, since b had different location having copy of a's initial value
    }

    // custom object types are modified using pass by value. Object reference is passed by value
    private static void modifyingCustomObjectType(Dog newDog) {

        if (newDog.getName().equalsIgnoreCase("MAX")) {
            System.out.println("Inside MAX");
        }

        newDog.setName("New Name");

        newDog = new Dog("jeeni");

        if (newDog.getName().equalsIgnoreCase("MAX")) {
            System.out.println("Inside MAX");
        } else {
            System.out.println("Inside Jenni");
        }
    }
}


class Dog {
    String name;

    public Dog(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
