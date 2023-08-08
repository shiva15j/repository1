package dY5;

import java.util.Scanner;

public class shape {
	// run()
// Reusebility

	// shivani :- rectangle

	// megha:- rectnagle , 13

	public static void rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lenght=:");
		int l = sc.nextInt();
		System.out.println("Bredth=:");
		int b = sc.nextInt();

		int recarea = l * b;
		System.out.println("Rectnagle area =:" + recarea);

	}

	public static void sqaure() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side=:");

		int side = sc.nextInt();

		int area = side * side;
		System.out.println("The area of the sqaure is=:" + area);
	}

	public static void circle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius=:");

		float r = sc.nextFloat();

		double area = 3.14 * r * r;
		System.out.println("The area of the circle is=:" + area);

	}

	public static void main(String[] args) {
		shape.sqaure();
		System.out.println("_________________________");
		shape.rectangle();
		System.out.println("_________________________");
		shape.circle();

	}

}
