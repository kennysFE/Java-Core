package lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Khởi tạo file

		File file = new File("exampleiostream");

		try {
			// Kiem tra file ton tai
			if (file.exists()) {
				System.out.println(" File exist" + file.getName());
				file.delete();
			} else {
				file.createNewFile();
				System.out.println(" File craete succeesfully ");
			}
		} catch (IOException e) {
			System.out.println(" Error check file exist !");
			// In lỗi ra màn hình console
			e.getStackTrace();
		}

		// Ghi File
		FileOutputStream fos = null;

		try {
			// Create Connect to File (Tao mot ket noi toi file)
			fos = new FileOutputStream(file);

			while (true) {
				// Data add on file
				System.out.println("Enter your data ");
				String str = scanner.nextLine();

				// Chuyen doi chuoi thanh mang byte, ma hoa thanh utf8
				byte[] strbyte = str.getBytes("utf8");

				// Ghi mang byte vao file
				fos.write(strbyte);

				System.out.println("Countinous ? [Y/n]");
				String choice = scanner.nextLine();
				if (choice.equals("n") || choice.equals("N")) {
					break;
				}
			}

		} catch (IOException e) {
			System.out.println(" Error Wrriting data on file ");
			// In lỗi ra màn hình console
			e.getStackTrace();
		} finally {

			// Neu file khong co du lieu them vao => khong dong ket noi toi file
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					System.out.println("Closed file not successfully");
					e2.getStackTrace();
				}
			}
		}

		// Doc File

		FileInputStream fis = null;

		// Ghep chuoi

		StringBuilder stringbuilder = new StringBuilder();

		try {
			// Create connect to file (Tao ket noi toi file )
			fis = new FileInputStream(file);

			// Tao bien lay gia tri khi file doc du lieu
			int code;

			while ((code = fis.read()) != -1) {
				// Chuyen doi tui byte sang ki tu
				char c = (char) code;

				// Gep tung ki tu lai voi nhau => du lieu ban dau
				stringbuilder.append(c);

			}

			// Hien chuoi ra man hinh
			System.out.println(" Show Data : " + stringbuilder.toString());

		} catch (Exception e) {
			// Doc file khong thanh cong
			System.out.println("Reading data on file not successfully");
			// Xuat hien loi ra man hinh
			e.getStackTrace();

		} finally {

			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					// Doc file khong thanh cong
					System.out.println(" Closed file not successfully ");
					// Xuat hien loi ra man hinh
					e2.getStackTrace();
				}
			}
		}

		scanner.close();
	}
}
