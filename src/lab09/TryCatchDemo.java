package lab09;

public class TryCatchDemo {
	public static void TryCatch() {
		try {
			int k = 5 / 0; // Chia cho 0 gây ra lỗi ArithmeticException
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println("Lỗi: Chia cho 0!");
		} catch (Exception e) { // Bắt tất cả các ngoại lệ khác
			System.out.println("Lỗi: " + e.getMessage());
		}
	}

	/**
	 * Ví dụ này có hai khối catch. Khối catch đầu tiên chỉ bắt lỗi
	 * ArithmeticException. Khối catch thứ hai sử dụng kiểu Exception để bắt tất cả
	 * các ngoại lệ khác. Nếu lỗi xảy ra là ArithmeticException, code trong khối
	 * catch đầu tiên sẽ được thực thi. Nếu lỗi xảy ra không phải là
	 * ArithmeticException, code trong khối catch thứ hai sẽ được thực thi, in ra
	 * thông báo "Lỗi: " kèm theo thông tin chi tiết về lỗi.
	 **/

	public static void TryCatchFinal() {
		try {
			int x = 10 / 0; // Chia cho 0 gây ra lỗi ArithmeticException
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("Lỗi: Chia cho 0!");
		} finally {
			System.out.println("Luôn được thực thi, bất kể có lỗi hay không!");
		}
	}

	/**
	 * Ham Finally se thuc hien sau khi ham try catch chay xong Ham Finally luon
	 * thuc hien du try catch co thuc hien hay khong Ham Finall duoc su dung de dong
	 * cac ket noi hay cac file cua chuong trinh
	 **/

	public static void main(String[] args) {
		System.out.println("Demo Try-Catch-Finally");
		TryCatch();
		TryCatchFinal();
	}
}
