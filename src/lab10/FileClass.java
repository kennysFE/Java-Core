package lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) {
		File file = new File("example.txt");

		try {
			if (file.exists()) {
				System.out.println(" File exist " + file.getName());
				file.delete();
			} else {
				file.createNewFile();
				System.out.println("File craete succeesfully");
			}
		} catch (IOException e) {
			System.out.println("Loi file");
			// In lỗi ra màn hình console
			e.printStackTrace();
		}

		// Ghi File
		FileOutputStream fos = null;
		try {
			// Create Connect to File (Tao mot ket noi toi file)
			fos = new FileOutputStream(file);

			// Data add on file
			String str = "Input Data";

			// Chuyen doi chuoi thanh mang byte, ma hoa thanh utf8

			byte[] data;
			data = str.getBytes("utf8");

			// Ghi mang byte vao file

			fos.write(data);

		} catch (IOException e) {
			System.out.println("Them du lieu vao file ko thanh cong");
			// In lỗi ra màn hình console
			e.printStackTrace();
		} finally {

			// Neu file khong co du lieu them vao => khong dong ket noi toi file
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					System.out.println("Loi them du lieu va file");
					e2.printStackTrace();
				}
			}
		}

		// Doc File
		FileInputStream fis = null;

		// Gep chui
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

			System.out.println(stringbuilder);

		} catch (Exception e) {
			System.out.println("Doc file ko thanh cong");
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					System.out.println(" Doc file khong thanh cong ");
					e2.printStackTrace();
				}
			}
		}

	}
}
