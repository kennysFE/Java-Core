package Lab12;

public class GenericMain {
	public static void main(String[] args) {
		// ---------------------- Generic Class ------------------------------------

		// Khoi tao mot generic voi du lieu ban dau
		GenericClass<String> stringBox = new GenericClass<String>("Main1");

		// Xuat man hinh
		System.out.println("Value " + stringBox.getContent());

		// Thay doi noi dung
		stringBox.setContent("Main2");
		System.out.println("Value 2 " + stringBox.getContent());

		// ----------------------- Generic ArrayList -------------------------

		// Khoi tao Generic
		GenericArrayList<Student> studentList = new GenericArrayList<>();

		// Khoi tao mot object Student
		Student st1 = new Student("Nguyen B", 2);
		// Them object Student vao StudentList
		studentList.add(st1);

		// Tuong tu nhu tren, viet ngan gon
		studentList.add(new Student("Nguyen A", 10));

		System.out.println("Student List :" + studentList.toString());

		// ----------------------- Generic Interface -------------------------

		// Khoi tao Generic
		GenericInterface<String> stringFace = new GenericInterface<>();

		stringFace.add("Face1");
		stringFace.add("Face2");
		stringFace.add("Face3");

		System.out.println("Value of generic interface " + stringFace.toString());

		stringFace.printList();

	}
}
