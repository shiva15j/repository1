package day4;

import java.util.Scanner;

public class switchdemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day=:");
		int day = sc.nextInt();

		switch (day) { // day =9
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednsday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Not a day of the week");
			break;
		}

	}

}
