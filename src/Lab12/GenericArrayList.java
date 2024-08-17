package Lab12;

import java.util.ArrayList;

public class GenericArrayList<E extends Student> {

	// Khai bao mot array list voi element ke thua tu class Student
	ArrayList<E> list = new ArrayList<>();

	// Constructor
	public GenericArrayList() {

	}

	// Method Add element
	public void add(E e) {
		list.add(e);
	}

	// Method Get element

	public E get(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return "GenericArrayList [list=" + list + "]";
	}

}
