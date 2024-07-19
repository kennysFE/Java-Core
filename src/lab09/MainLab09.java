package lab09;

import java.util.Scanner;

public class MainLab09 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap ho va ten sinh vien: ");
		String hoTenSinhVien = scanner.nextLine();
		
		// Handle Ma Sinh Vien 
		int maSinhVien;
		while (true) {
			System.out.printf("Nhap ma sinh vien: ");
			try {
				maSinhVien = scanner.nextInt();
				break;
			} catch (Exception e) {
				// handle exception
				System.out.println("Thong tin ma so sinh vien ko chinh xac, nhap lai ma so sinh vien");
				scanner.next();
			}

		}
		
		// Handle Diem Sinh Vien
		double diemSinhVien;
		while (true) {
			System.out.printf("Nhap diem sinh vien: ");
			try {
				diemSinhVien = scanner.nextDouble();
				try {
					if (diemSinhVien > 0 && diemSinhVien < 10 ) {
						break;
					} else {
						throw new Exception();
					}
				} catch (Exception e) {	
					// TODO: handle exception
					System.out.println("Diem so sinh vien chua khong hop le");
					}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Thong tin diem sinh vien ko chinh xac, nhap lai diem sinh vien ");
				scanner.next();
			}
			
		}
		
		// Handle Age Sinh Vien 
		int ageSinhVien;
		while (true) {
			System.out.printf("Nhap tuoi sinh vien: ");
			try {
				ageSinhVien = scanner.nextInt();
				try {
					if (ageSinhVien > 100 && ageSinhVien < 1000 ) {
						break;
					} else {
						throw new Exception();
					}
				} catch (Exception e) {	
					// TODO: handle exception
					System.out.println("Tuoi sinh vien chua khong hop le");
					}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Thong tin tuoi sinh vien ko chinh xac, nhap lai tuoi sinh vien ");
				scanner.next();
			}
			
		}
		
		
		SinhVien st1 = new SinhVien(maSinhVien, hoTenSinhVien, diemSinhVien, ageSinhVien);
		System.out.println("Thong tin Sinh Vien " + st1.toString());
		scanner.close();

	}
}
