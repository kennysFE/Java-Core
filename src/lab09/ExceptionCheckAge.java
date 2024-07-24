package lab09;

public class ExceptionCheckAge extends Exception {
	public int ageSinhVien;

	public ExceptionCheckAge(int ageSinhVien) {
		this.ageSinhVien = ageSinhVien;
	}

	public String getMessage() {
		return "Tuoi sinh vien chua khong hop le : " + ageSinhVien + " ";
	}
}
