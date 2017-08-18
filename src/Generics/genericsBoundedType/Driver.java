package Generics.genericsBoundedType;

public class Driver {
	public static void main(String[] args) {
		
	}
	
	public static <T extends Comparable<T>> int compare(T t1, T t2) {
		return t1.compareTo(t2);
	}
	
}
