package Constructdemo;

public class Dog {

	// Constructor name should be same as of the class name

	// Constructor should not be called it is going to be instantiated automatically
	// at the time of object creation

	// Constructor do not have any type

	public Dog() {
		System.out.println("I am a Consturctor");
	}

	public Dog(String name) {
		System.out.println("I am a Dog with name=:" + name);
	}

	public void bark() {
		System.out.println("This dog can bark");
	}

	public void eat() {
		System.out.println("This dog can eat");
	}

}
