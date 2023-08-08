package inheritencedemo;

public class carmain {
	
	public static void main(String[] args) {
		Car cc = new Car();
		cc.airbag();
		cc.speed();
		
		System.out.println("______________");
		
		Sedan ss = new Sedan();
		ss.airbag();
		ss.speed();
		ss.sunroof();
		ss.tyres();
		System.out.println("______________");
		
		Suv sv = new Suv();
		sv.airbag();
		sv.speed();
		sv.height();
		sv.seater();
		
	}

}
