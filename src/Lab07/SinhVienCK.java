package Lab07;

public class SinhVienCK extends SinhVien {
	
	// Atribute
	private String skill;
	
	
	// Contructor
	public SinhVienCK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienCK(String skill, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.skill = skill;
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

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	
	
	
}
