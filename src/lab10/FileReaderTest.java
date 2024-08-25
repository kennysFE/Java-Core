package lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderTest {
	public static void main(String[] args) {
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
