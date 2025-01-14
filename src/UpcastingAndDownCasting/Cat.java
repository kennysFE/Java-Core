package UpcastingAndDownCasting;

public class Cat extends Animal {

	public void meow() {
		System.out.println("meowing...");
	}

	@Override
	public void eat() {
		System.out.println(" Cat eating ... ");
	}
}
