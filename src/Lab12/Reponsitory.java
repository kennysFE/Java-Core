package Lab12;

public interface Reponsitory<T> {
	void add(T item);

	T get(int index);
}
