package Library_Management;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class BookManagement implements Comparator<Book> {
	// Arraylist book
	ArrayList<Book> bookList = new ArrayList<>();

	// Add book
	public void addBook(Book book) {
		bookList.add(book);
	}

	// Show infor book
	public void displayBookList() {
		if (bookList.size() != 0) {
			System.out.println("----------- List Book-----------");
			for (Book bookMember : bookList) {
				System.out.println(bookMember.toString());
			}
		} else {
			System.out.println(" Book not exist !");
		}
	}

	// Method override compare
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}

	// Arrange by authorName
	public void arrangeByAuthorName() {
		if (bookList.size() > 1) {
			bookList.sort((o1, o2) -> o1.getAuthorName().compareTo(o2.getAuthorName()));
			System.out.println("----------- List Book-----------");
			for (Book bookMember : bookList) {
				System.out.println(bookMember.toString());
			}
		} else if (bookList.size() > 0) {
			System.out.println(bookList.get(0).toString());
		} else {
			System.out.println(" Book not exist !");
		}
	}

	// Save Text File (text file)
	public void saveTextFile() {
		if (bookList.size() != 0) {
			// Create value initiator = null
			FileOutputStream fos = null;

			try {
				// Connect file
				fos = new FileOutputStream("book.txt", true);

				// Headerformat file
				String headerFormat = " Book Name, Author Name, Publish Date, Manufacturer Name , Price "
						+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";

				// Writting headerFormat on file
				fos.write(headerFormat.getBytes("utf-8"));

				for (Book bookmember : bookList) {
					fos.write(bookmember.displayFileSaving().getBytes("utf-8"));
				}

			} catch (FileNotFoundException e) {
				System.out.println("File not found ");
				e.getStackTrace();
			} catch (IOException e) {
				System.out.println("Input invalid ");
				e.getStackTrace();
			} finally {
				if (fos != null) {
					try {
						fos.close();
					} catch (Exception e) {
						System.out.println(" Closed file error !");
						e.getStackTrace();
					}
				}
			}
		} else {
			System.out.println(" Book not exist !");
		}

	}

	// Save File Object

	public void saveFileObject() {
		if (bookList.size() != 0) {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream("book.vn");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(bookList);
			} catch (FileNotFoundException e) {
				System.err.println("File not found");
				e.getStackTrace();
			} catch (IOException e) {
				System.err.println("Output invalid");
				e.getStackTrace();
			} finally {
				if (fos != null && oos != null) {
					try {
						fos.close();
						oos.close();
					} catch (Exception e2) {
						System.err.println(" Closed FileOutputStream error ");
						e2.getStackTrace();
					}
				}
			}
		} else {
			System.err.println(" Book not exist !");
		}

	}

	// Read File Text

	public void readFileText() {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("book.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException ex) {
			System.err.println(" File not found ");
			ex.getStackTrace();
		} catch (IOException ex) {
			System.err.println(" Output invalid ");
			ex.getStackTrace();
		} finally {
			if (fileReader != null && bufferedReader != null) {
				try {
					fileReader.close();
					bufferedReader.close();
				} catch (Exception e) {
					System.err.println(" Closed file reader error !");
				}
			}
		}

	}

	// Read File Object File

	public void readFileObject() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("book.vn");
			ois = new ObjectInputStream(fis);
			ArrayList<Book> bookListReadFile = (ArrayList<Book>) ois.readObject();
			bookListReadFile.forEach(book -> {
				bookList.add(book);
				System.out.println(book.toString());
			});
		} catch (FileNotFoundException e) {
			System.out.println(" File not found ");
			e.getStackTrace();
		} catch (IOException e) {
			System.out.println(" Input invalid ");
			e.getStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println(" Class not found ");
			e.printStackTrace();
		} finally {
			if (fis != null && ois != null) {
				try {
					fis.close();
					ois.close();
				} catch (Exception e) {
					System.out.println(" File closed error ");
					e.getStackTrace();
				}
			}
		}

	}
}
