package Generics.genericMethod;

import java.util.HashMap;
import java.util.Map;

public class Animal {
	private String _name;
	
	public Animal() {
		//do nothing
	}
	
	public Animal(String name) {
		_name = name;
	}
	
	@Override public String toString() {
		return String.format("%s] Name: %s\n", getClass().getName(), _name);
	}
	
	
	
	public static void main(String[] args) {
		Map<String, String> tags = new HashMap<>();
		tags.put("123", null);
	}
}
