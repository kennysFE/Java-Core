package Lab12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {

		// Cấu trúc: Lưu trữ dữ liệu dưới dạng các cặp khóa-giá trị (key-value).
		// Tổ chức: Sử dụng bảng băm (hash table) để lưu trữ các phần tử.

		// Khoi tao Hashmap
		HashMap<String, Integer> map = new HashMap<>();

		// Them cac cap khoa va gia tri vao trong hashmap
		map.put("Apple", 10);
		map.put("Banana", 20);
		map.put("Cherry", 30);

		// Truy xuat gia tri theo khoa

		System.out.println(" Value of apple : " + map.get("Apple"));

		// Kiem tra su ton tai cua cap khoa-gia tri, ham containsKey tra ve gia tri
		// true/false

		if (map.containsKey("Banana")) {
			System.out.println("Key available in table " + map.containsKey("Banana"));
		}

		// Xoa mot cap gia tri khoa
		map.remove("Cherry");

		// Lap qua cac cap khoa gia tri thong qua ham keyset lay tat ca cac khoa co
		// trong hashtable

		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));

		}

		// Example HashMap Student

		// Tao HashMap
		HashMap<String, HashMapStudent> studentList = new HashMap<>();

		// Tao value student thong qua Contructor student

		HashMapStudent student1 = new HashMapStudent("a1", "Nguyen A");
		HashMapStudent student2 = new HashMapStudent("b1", "Nguyen C");

		studentList.put(student1.rollNo, student1);
		studentList.put(student2.rollNo, student2);

		// Duyet qua studentList lay danh sach cua cac student

		// Set<String> keys = studentList.keySet();

		// System.out.println(keys.);

		// for (int i = 0; i < keys.size(); i++) {
		// System.out.println("Value of student" + i + studentList.get(keys));
		// }

		for (String keys : studentList.keySet()) {
			System.out.println("Value of student " + keys + " " + studentList.get(keys).toString());
		}

		// Tree Map, LinkedMap
		TreeMap<String, String> treeMap = new TreeMap<>();
		LinkedHashMap<String, String> linked = new LinkedHashMap<>();

		// Tree Map, LinkedMap su dung tuong tu nhu HashMap
	}
}
