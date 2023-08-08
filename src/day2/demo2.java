package day2;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pin=:");
		
		int pin=sc.nextInt();
		
		System.out.println("Enter your username=:");
		String username=sc.next();
		
		if(username.equals("Alok") && pin==1234) {
			System.out.println("Welcome");
		}
		else{
			System.out.println("Incorrect username or passswrod");
		}
		
		
		
		
	}

}
