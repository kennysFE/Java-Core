package Lab07;

public class SinhVienIT extends SinhVien {
	
	// Atribute
	private String language;
	private double scoreJava;
	private double scoreHTML;
	
	
	
	// Contrustor 
	public SinhVienIT(String language, String id, String name, double price, 
			double tax,double scoreJava, double scoreHTML ) 
	{
		super(id, name, price, tax);
		this.language = language;
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
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
	
	
	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
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
	void getDiem() {
		double scoreSinhVienIt =  (this.scoreJava * 2 + this.scoreHTML)/3;
		System.out.println("Diem Sinh Vien IT = " + scoreSinhVienIt );
	}
	
	
	
}
