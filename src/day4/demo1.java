package day4;

public class demo1 {

	public static void main(String[] args) {

		int Number[] = { 1, 3, 5, 68, 9, 6 };

		char c[] = { 'a', 'n', 'd', 's' };

		boolean vb[] = { true, false, true, false };
		System.out.println("****************");
		for (boolean cond : vb) {
			System.out.println(cond);
		}
		System.out.println("****************");

		for (char cd : c) {
			System.out.println(cd);
		}
		System.out.println("****************");
		for (int num : Number) {
			System.out.println(num);
		}
		System.out.println("****************");
	}

}
