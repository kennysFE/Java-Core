package Lab07;

public class SinhVienCK extends SinhVien {
	
	// Atribute
	private String skill;
	private double scoreCNC;
	private double scorePLC;
	
	
	
	// Contructor
	public SinhVienCK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienCK(String skill, String id, String name, double price, double tax, 
			double scoreCNC,double scorePLC ) {
		super(id, name, price, tax);
		this.skill = skill;
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	public String toString() {
		return "SinhVienCK [skill=" + skill + ", id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax
				+ "]";
	}

	
	// Getter, Setter
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	@Override
	void getDiem() {
		double scoreSinhVienCK =  (this.scoreCNC + this.scorePLC)/2;;
		System.out.println("Diem Sinh Vien IT = " + scoreSinhVienCK );
	}
	

	
	
	
	
	
	
	
}
