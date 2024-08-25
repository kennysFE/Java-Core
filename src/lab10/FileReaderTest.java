package lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderTest {
	public static void main(String[] args) {

		/*
		 * So sánh cụ thể: Đối tượng dữ liệu: FileInputStream hoạt động với dữ liệu
		 * byte, trong khi FileReader làm việc với dữ liệu ký tự.
		 * 
		 * Dùng cho loại tệp: FileInputStream thường được dùng cho tệp nhị phân (như
		 * hình ảnh, âm thanh), còn FileReader được dùng cho tệp văn bản.
		 * 
		 * Xử lý Encoding: FileReader tự động xử lý encoding ký tự (như UTF-8), trong
		 * khi FileInputStream không quan tâm đến encoding, nên cần xử lý encoding một
		 * cách thủ công khi cần thiết.
		 */

		// Tao mot FileReader
		FileReader reader = null;

		// Doc du lieu dau vao tu mot input (file)
		BufferedReader bufferedReader = null;

		try {
			// tao mot ket noi toi phai can doc
			reader = new FileReader("file");

			// Doc du lieu tu ket noi reader
			bufferedReader = new BufferedReader(reader);

			String line;

			// Đọc từng dòng dữ liệu có trong file
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException ex) {
			Logger.getLogger(FileReaderTest.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(FileReaderTest.class.getName()).log(Level.SEVERE, null, ex);
		}

		finally {
			try {
				reader.close();
			} catch (IOException ex) {
				// TODO: handle exception
				Logger.getLogger(FileReaderTest.class.getName()).log(Level.SEVERE, null, ex);
			}

			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					// TODO: handle exception
					Logger.getLogger(FileReaderTest.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}
}
