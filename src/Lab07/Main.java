package Lab07;

public class Main {
	public static void main(String[] args) {
		SinhVienIT st1 = new SinhVienIT("java", "123", "Hoen", 10, 0.1, 8, 9);
		SinhVienIT st2 = new SinhVienIT();
		SinhVienCK st3 = new SinhVienCK("car", "123", "Hoen", 10, 0.1, 6, 8);
		SinhVienCK st8 = new SinhVienCK();
		
		
		st2.setLanguage("JavaScript");
		st1.getMoney();
		
		st1.getDiem();
		st3.getDiem();
		
		System.out.println("Check Sinh Vien:" + st1);
		System.out.println("Check Sinh Vien:" + st2);
		
		System.out.println("Check Sinh Vien:" + st3);
		System.out.println("Check Sinh Vien:" + st8);
		
	}
}
