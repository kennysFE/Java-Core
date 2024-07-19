package lab09;

public class SinhVien {
	
	// Atribute 
	private int masv;
	private String hoTen; 
	private double diem;
	private int age;
	
	// Constructor 
	
	public SinhVien() {
		
	}
	
	public SinhVien(int masv, String hoTen, double diem, int age ) {
		this.masv = masv;
		this.hoTen = hoTen;
		this.diem = diem;
		this.age = age;
	}

	
	// Getter, Setter
	
	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Method toString 
	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoTen=" + hoTen + ", diem=" + diem + ", age=" + age + "]";
	}
	
	
	
	
}
