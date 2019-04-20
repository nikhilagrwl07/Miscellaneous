package Generics.genericClass.TwoParameter;

import java.util.Arrays;

public class CustomMap<T extends Entry> {

    private Entry[] entries;
    private int currentIndex = -1;

    public CustomMap(int capacity) {
        this.entries = new Entry[capacity];
    }

    public void add(Entry e) {
        if (!contains(e)) {
            currentIndex++;
            entries[currentIndex] = e;

        }
    }

    public boolean contains(Entry e) {

        boolean isPresent = false;

        for (int i = 0; i <= currentIndex; i++) {
            if (entries[i].getT1() == e.getT1() && entries[i].getT2() == e.getT2()) {
                isPresent = true;
            }
        }
        return isPresent;
    }

    @Override
    public String toString() {
        return "CustomMap{" +
                "entries=" + Arrays.toString(entries) +
                ", currentIndex=" + currentIndex +
                '}';
    }
}
