package Random;

public class JavaPassByValue {

    public static void main(String[] args) {
        Dog aDog = new Dog("D1");
        System.out.println(aDog.getName());

        changeName(aDog);
        System.out.println(aDog.getName());

        changeNameWithPassByValue(aDog);
        System.out.println(aDog.getName());

    }

    public static void changeName(Dog aDog){
        aDog = new Dog("D3");
    }

    public static void changeNameWithPassByValue(Dog aDog){
        aDog.setName("D3");
    }

}


class Dog{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }
}