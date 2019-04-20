package Generics.genericClassesSubtyping;

public class MainDriver {
    public static void main(String[] args) {

        MyGenericList<String> stringMyGenericList = new MyGenericList<>();
        stringMyGenericList.addElement("Nikhil");
        stringMyGenericList.addElement("Ritu");


        MyGenericList<Integer> integerMyGenericList = new MyGenericList<>();
        integerMyGenericList.addElement(10);
        integerMyGenericList.addElement(20);


    }
}
