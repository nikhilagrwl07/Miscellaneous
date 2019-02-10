package Generics.genericInterface;

/**
 * @author Nikhil Agrawal on 8/16/17.
 */
public interface Service<T,U> {
	T executeService(U... args);
}
