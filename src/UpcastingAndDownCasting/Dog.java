package UpcastingAndDownCasting;

public class Dog extends Animal {

	public void meow() {
		System.out.println("meowing...");
	}

	@Override
	public void eat() {
		System.out.println(" Dog eating ... ");
	}

	@Override
	public void sleep() {
		System.out.println(" Dog sleeping... ");
	}

}
