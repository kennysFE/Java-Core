package chapter4;

public class video23 {
	public static void main(String[] args) {
		System.out.println("video 23 ");
//		khai bao 1 doi tuong va gan gia tri vao doi tuong

		student st1 = new student();

		student st2 = new student("hoen", 26, "hoen nguyen");

		st2.setFullName("hoen21082001");

		System.out.println(st2.getAge() + " " + st2.getFullName());
		System.out.println(st1.getAge());
	}
}
