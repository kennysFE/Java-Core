package lab04;

public class Object {
	public static void main(String[] args) {
		Product product = new Product();
		Product sanPhamA = product.nhapThongTin("computer", 10, 3);
		product.xuatThongTin(sanPhamA);
		System.out.println("Gia cua san pham :" + product.getTaxPrice(sanPhamA.getPrice(), sanPhamA.getTax()));
	}
}
