package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectFile {
	public static void SaveFile() {
		ArrayList<Student> studentList = new ArrayList<>();

		// studentList.add(new Student())
//		studentList.add(new Student("Nguyen Van T", "BD2"));
//		studentList.add(new Student("Ngo Van C", "DS1"));
//		studentList.add(new Student("Nguyen E", "MM3"));
		studentList.add(new Student("Nguyen K", "MM1111"));

		// Khai bao mot ket noi toi file

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("studentBinary.dat", true);

			oos = new ObjectOutputStream(fos);

			for (Student std : studentList) {
				oos.writeObject(std);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.getStackTrace();
		} catch (IOException e) {
			System.out.println("Output invalid");
			e.getStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					// TODO: handle exception
					System.out.println("Closed file not successfully");
					e2.getStackTrace();
				}
			}
		}
	}

	public static void ReadFile() {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("studentBinary.dat");
			ois = new ObjectInputStream(fis);

			Object obj = null;

			while ((obj = ois.readObject()) != null) {
				Student student = (Student) obj;
				System.out.println(student);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found ");
			e.getStackTrace();
		} catch (IOException e) {
			System.out.println("Input invalid ");
			e.getStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found ");
			e.getStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					System.out.println("Fis closed not successfully");
				}
			}
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
					System.out.println("Ois closed not successfully");
				}
			}
		}
	}

	public static void main(String[] args) {
//		SaveFile();
		ReadFile();
	}
}