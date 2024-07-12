package chapter5;

import java.util.ArrayList;

import chapter4.student;

public class Array_List {
	
	public static void main(String[] args) {
		ArrayList a2 = new ArrayList();// khai báo với bất cứ type phù hợp . 
		
//		Generic 
//		+ Giup tai su dung khi code
//		+ Giup bao loi khi chạy ứng dụng
		ArrayList<String> a3 = new ArrayList<String>();// Generic 
		
//		Java Diamond 
//		+ Su dung contructor với generic
//		+ không bắt buộc truyền type (vi compile tự động thêm vào type) 
		ArrayList<student> a1 = new ArrayList<>();// Java Diamond  
		
		
		a3.add("hello");
		a1.remove(1);
		System.out.println("hello 1" );
	}
	
	
	
	
}
