package Generics.genericMethod;

import java.util.HashMap;
import java.util.Map;

public class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s] Name: %s\n", getClass().getName(), name);
    }

    public static void main(String[] args) {
        Map<String, String> tags = new HashMap<>();
        tags.put("123", null);
    }
}
