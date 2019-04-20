package Generics.genericClass.TwoParameter;

// Generic Class with 2 generic values
public class Entry<T1, T2 > {

    private T1 t1;
    private T2 t2;

    public Entry(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}
