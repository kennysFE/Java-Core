package UpcastingAndDownCasting;

public class Application {

	public static void main(String[] args) {

		// Upcasting Dog => Animal
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animalChecked = new Animal();

		Animal animal = cat;
		Animal animal1 = dog; // Chuyen kieu khong tuong minh
		Animal animal2 = (Animal) dog; // Chuyen kieu tuong minh

		animal1.eat();
		animal1.sleep();
		animal1.specialAnimal();

		// animal2.eat();
		// animal2.sleep();
		// animal2.specialAnimal();

		// Downcasting
		Dog dog2 = (Dog) animal1;// Chuyen kieu tuong minh
		// Cat cat1 = (Cat) cat;// Lỗi vì đối tượng cat chưa tồn tại nên không thể down
		// casting đối tượng đc
//		Cat cat2 = (Cat) animalChecked;

		dog2.eat();
		dog2.sleep();
		dog2.meow();
		dog2.specialAnimal();

//		cat1.eat();
//		cat1.meow();
//		cat1.sleep();
//		cat1.specialAnimal();
//
//		cat2.eat();
//		cat2.meow();
//		cat2.sleep();
//		cat2.specialAnimal();

	}
}
