package inheritencedemo;

public class Humainmain {

	public static void main(String[] args) {
		parent pp = new parent();
		pp.ears();
		pp.nose();
		pp.eyes();
		System.out.println("_____________");

		child cc = new child();
		cc.ears();
		cc.nose();
		cc.eyes();
		cc.walk();
		cc.run();
		System.out.println("_____________");
		
		grandchild gg = new grandchild();
		gg.eyes();
		gg.ears();
		gg.nose();
		gg.walk();
		gg.run();
		gg.eat();
		gg.sleep();
				
		
	}

}
