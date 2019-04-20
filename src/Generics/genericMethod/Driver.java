package Generics.genericMethod;

public class Driver {
    private static final int SIZE = 10;

    public static void main(String[] args) {

        Animal[] myAnimals = new Animal[SIZE];
        myAnimals[0] = new Animal("Aardvark");
        myAnimals[1] = new Animal("Bear");
        myAnimals[2] = new Animal("Chipmunk");
        myAnimals[3] = new Animal("Dog");
        myAnimals[4] = new Animal("Eagle");
        myAnimals[5] = new Animal("Frog");
        myAnimals[6] = new Animal("Giraffe");
        myAnimals[7] = new Animal("Hedgehog");
        myAnimals[8] = new Animal("Ibex");
        myAnimals[9] = new Animal("Jaguar");
        int p1 = 2;
        int p2 = 3;

        swapItems(p1, p2, myAnimals);
    }

    //a generic swap method
    public static <T extends Animal> void swapItems(int p1, int p2, T[] items) {
        T temp = items[p1];
        items[p1] = items[p2];
        items[p2] = temp;
    }

    //a generic swap method with T as return type
    public static <T extends Animal> T swapItemsWithSomeReturn(int p1, int p2, T[] items) {
        T temp = items[p1];
        items[p1] = items[p2];
        items[p2] = temp;
        return items[p2];
    }

    //a generic item printer
    public static <T extends Animal> void printItems(T[] items) {
        for (T item : items) {
            System.out.println("Next " + item.getClass().getName() + ": " + item);
        }
    }
}
