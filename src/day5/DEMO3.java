package day5;

import java.util.Scanner;

public class DEMO3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your username:");
		String username = sc.next();

		System.out.println("Enter your pin=:");

		int pin = sc.nextInt();
		
		if(username.equals("kanishk")&&pin==1234) {
			System.out.println("Welocome to homepage=:");
		
		}
		else if(username.equals("abdul")&&pin==4567) {
		
			System.out.println("Welocome to homepage=:");
		}
		else {
			System.err.println("Invalid credentails");
		}

	}

}
