package Lab12;

import java.util.ArrayList;

public class GenericInterface<T> implements Reponsitory<T> {

	ArrayList<T> list = new ArrayList<>();

	// Contructor
	public GenericInterface() {

	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		list.add(item);

	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

	@Override
	public String toString() {
		return "GenericInterface [list=" + list + "]";
	}

	// Duyet cac phan tu co trong mang
	public void printList() {
		for (T keys : list) {
			System.out.println(keys);
		}
	}

}
