package dY5;

import java.util.Scanner;

public class calculator {

	public static void sum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num1=:");
		int num1 = sc.nextInt();

		System.out.println("Num2=:");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum of the two no is=:" + sum);
	}

	// Create method for sub , div , mul , mod

	public static void main(String[] args) {
		calculator.sum();
	}

}
