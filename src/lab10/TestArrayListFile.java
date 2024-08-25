package lab10;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class TestArrayListFile {
	public static void main(String[] args) {
		// Tao mot mang studentList chua thong tin
		ArrayList<Student> studentList = new ArrayList<>();

		// Them cac phan tu vao mang ]

		studentList.add(new Student("Nguyen Van A", "BD"));
		studentList.add(new Student("Ngo Van B", "DS"));
		studentList.add(new Student("Nguyen D", "MM"));

		// Khoi tao mot connect toi file
		FileOutputStream fos = null;

		try {
			// Tao connect toi file
			fos = new FileOutputStream("student.txt");

			// Them tieu de vao file (Ten cac bien)
			String line = Student.getFileHeaderFormat() + "\n";

			// Chuyen String -> Byte
			byte[] b = line.getBytes();

			// Ghi file
			fos.write(b);

			// Duyet qua tung phan tu co trong mang
			for (Student std : studentList) {
				// Lay du lieu tung phan tu co trong mang
				line = std.getFileLineFormat() + "\n";

				// Chuyen String -> Byte
				b = line.getBytes();

				// Ghi file
				fos.write(b);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fos error");
			e.getStackTrace();
		} finally {
			// Xac nhan dieu kien dong file (File khac null)
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println("Closed File Not Successfully");
				}
			}
		}

	}
}
