package Lab07;

public class SinhVienIT extends SinhVien {
	
	// Atribute
	private String language;
	
	
	// Contrustor 
	public SinhVienIT(String language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}
	
	public SinhVienIT() {
		super();
	}

	
	// Getter, Setter
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	//Method 
	public void getMoney() {
		System.out.println("Run get money");
		super.infor();
	}

	@Override
	public String toString() {
		return "SinhVienIT [language=" + language + ", id=" + id + ", name=" + name + ", price=" + price + ", tax="
				+ tax + "]";
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
