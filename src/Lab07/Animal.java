package Lab07;

class Animal2 {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal2 {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class BabyDog1 extends Dog{  
	
}

class Cat extends Animal2 {
	void eat() {
		System.out.println("cat is eatting");
	}
}


public class Animal {
	public static void main(String[] args) {
		Animal2 a = new BabyDog1(); 
		Animal2 b = new Cat();
		b.eat();
		a.eat();  
	}
}
