package methodemo;

public class bikemain {

	public static void main(String[] args) {
		Bike bb = new Bikeimpl();

		bb.accelerator();
		bb.breaks();
		bb.gear();

		System.out.println("___________-");

		Superbike sb = new Superbikeimpl();
		sb.engine();
		sb.speed();
	}

}
