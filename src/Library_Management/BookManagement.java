package Library_Management;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
	public void saveTextFile(String nameFile) {
		if (bookList.size() != 0) {
			// Create value initiator = null
			FileOutputStream fos = null;

			try {
				// Connect file
				fos = new FileOutputStream(nameFile, true);

				// Headerformat file
				String headerFormat = "Book Name, Author Name, Publish Date, Manufacturer Name, Price" + "\n";

				// Writting headerFormat on file
				fos.write(headerFormat.getBytes());

				for (Book bookmember : bookList) {
					fos.write(bookmember.displayFileSaving().getBytes());
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

}
