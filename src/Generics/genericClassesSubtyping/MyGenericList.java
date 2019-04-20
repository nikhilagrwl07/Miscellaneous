package Generics.genericClassesSubtyping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikhil Agrawal on 8/16/17.
 */
class MyGenericList<T> {

    private List<T> genericList;

    public MyGenericList() {
        this.genericList = new ArrayList<>();
    }

    public void addElement(T t) {
        genericList.add(t);
    }

    public void removeElement(T t) {
        genericList.remove(t);
    }

    public T getElement(int index) {
        return genericList.get(index);
    }
}
