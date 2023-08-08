package Constructdemo;

public class dogmain {

	public static void main(String[] args) {

		Dog dd = new Dog();
		dd.bark();
		dd.eat();
		System.out.println("________________");
		Dog dg = new Dog("Tommy");
		dg.bark();
		dg.eat();
	}

}
