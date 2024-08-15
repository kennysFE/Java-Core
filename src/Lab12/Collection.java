package Lab12;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	public static void main(String[] args) {
		// Khai bao phan tu su dung mang ArrayList
		ArrayList<String> student = new ArrayList<String>();

		// Them cac phan tu vao mang
		student.add("a1");
		student.add("a2");
		student.add("a3");
		student.add("a4");
		student.add("a5");

		// Xoa cac phan tu
		student.remove(0);

		// Swap 2 phan tu trong mang
		String trm = student.get(2);
		student.set(2, student.get(3));
		student.set(3, trm);

		// Duyet va kiem tra cac phan tu co trong mang
		// Cach 1: Thong qua vong lap for va ham check cac phan tu trong mang ()
		System.out.println("Duyet mang theo cach 1: ");
		for (int i = 0; i < student.size(); i++) {
			System.out.println("phan tu thu " + student.get(i));
		}

		// Cach 2: Duyet qua cac phan tu thong qua bien item
		System.out.println("Duyet mang theo cach 2: ");
		for (String item : student) {
			System.out.println(item);
		}

		// Cach 3 : Su dung ham foreach de check cac phan tu trong mang
		System.out.println("Duyet mang theo cach 3: ");
		student.forEach((item) -> {
			System.out.println(item);
		});

		/*
		 * Cach 4: Su dung thong qua interface interator de duyet cac phan tu co trong
		 * collection, hashset
		 **/
		System.out.println("Duyet mang theo cach 4: ");
		Iterator<String> iterator = student.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}

		// Cach 5: Su dung Stream(); version java 01
		System.out.println("Duyet mang theo cach 5: ");
		student.stream().forEach(System.out::println);

		// Cach 6: Sung dung parallelStream() trong xu ly da luong, version java 8
		System.out.println("Duyet mang theo cach 6: ");
		student.parallelStream().forEach(System.out::println);

		System.out.println("test arraylist" + student.toString());
	}
}
