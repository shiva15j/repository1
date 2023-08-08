package day1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1=");
		int num1 = sc.nextInt();
		System.out.println("The num1=:" + num1);

		System.out.println("Enter num2=");
		int num2 = sc.nextInt();
		System.out.println("Enter num2=:" + num2);

//		boolean cond=num1==num2;
//		
//		System.out.println(cond);

		System.out.println(num1 == num2);

		System.out.println("Enter name1=:");

		String name1 = sc.next();

		System.out.println("Enter name2=:");

		String name2 = sc.next();

		boolean xyz = name1.equals(name2);

		System.out.println(xyz);

	}

}
