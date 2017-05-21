package Java8Constructs.LambdaAndStreams;

interface Vehicle {
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }

    default void print() {
        System.out.println("I am a vehicle!");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }
}


/**
 * Created by nikhilagrawal on 19/02/17.
 */
public class Java8Tester {
    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

class Car implements Vehicle, FourWheeler {
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}
