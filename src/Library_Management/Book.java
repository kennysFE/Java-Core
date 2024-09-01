package Library_Management;

import java.io.Serializable;

public class Book implements Serializable {

	// Atribute
	private String bookName;
	private String authorName;
	private String publishDate;
	private String manufacturerName;
	private int price;

	// Constructor

	public Book() {

	}

	public Book(String bookName, String authorName, String publishDate, String manufacturerName, int price) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishDate = publishDate;
		this.manufacturerName = manufacturerName;
		this.price = price;
	}

	// Getter, Setter

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// ToString
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", publishDate=" + publishDate
				+ ", manufacturerName=" + manufacturerName + ", price=" + price + "]";
	}

	// Display on file
	public String displayFileSaving() {
		return bookName + "," + authorName + "," + publishDate + "," + manufacturerName + "," + price + "\n";

	}

}
