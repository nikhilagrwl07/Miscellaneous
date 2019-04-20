package Generics.genericClass.TwoParameter;

public class Main {
    public static void main(String[] args) {
        Entry<String, Boolean> e1 = new Entry<>("Nikhil", true);
        Entry<String, Boolean> e2 = new Entry<>("Ritu", false);
        Entry<String, Boolean> e3 = new Entry<>("Menu", true);

        CustomMap<Entry> customMap = new CustomMap<>(5);
        customMap.add(e1);
        customMap.add(e2);
        customMap.add(e3);

        System.out.println(customMap);
    }
}
