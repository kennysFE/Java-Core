package lab06;

import java.util.ArrayList;

public class CheckStudent {
	public static void main(String[] args) {
		Student st1 = new Student("hoen1", "1");
		Student st2 = new Student("hoen2", "2");
		Student st3 = new Student("hoen3", "3");
		Student st4 = new Student("hoen4", "4");
		Student st5 = new Student("koen5", "5");
		
		ArrayList<Student> arrayStudent = new ArrayList<Student>();
		
		arrayStudent.add(st5);
		arrayStudent.add(st4);
		arrayStudent.add(st3);
		arrayStudent.add(st2);
		arrayStudent.add(st1);
		
		System.out.println(">>> Check Arrray : " + arrayStudent);
		
		for (int i = 0 ; i < arrayStudent.size() ; i++) {
			if (arrayStudent.get(i).getName().startsWith("hoen")) {
				System.out.println(arrayStudent.get(i));
			}
		}
		
	}
}	
