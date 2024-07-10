package chapter5;

import java.util.ArrayList;

import chapter4.student;

public class Array_List {
	
	public static void main(String[] args) {
		ArrayList a2 = new ArrayList();// Khong phai generic 
		
		ArrayList<String> a3 = new ArrayList<String>();// Generic 
		
		ArrayList<student> a1 = new ArrayList<student>();// Generic 
		
		
		a3.add("hello");
		a1.remove(1);
		System.out.println("hello 1" );
	}
	
	
	
	
}
