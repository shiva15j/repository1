package methodemo;

public class Bikeimpl extends Bike {

	@Override
	public void gear() {
		System.out.println("The bike has 4 gear");
	}

	@Override
	public void breaks() {
		System.out.println("The bike has disc breaks");

	}

	@Override
	public void accelerator() {
		System.out.println("The bike has good accelerator ");

	}

}
