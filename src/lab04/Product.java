package lab04;

public class Product {
	// Attribute
	private String name;
	private double price;
	private double tax;

	// Constructor

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// Getter, Setter

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getTax() {
		return tax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// Method , Function

	public Product nhapThongTin(String name, double price, double tax) {
		Product product = new Product(name, price, tax);
		return product;
	}

	public void xuatThongTin(Product prod) {
		System.out.println(" Ten san pham " + prod.name + " gia san pham " + prod.price + " thue san pham " + prod.tax);
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

}
