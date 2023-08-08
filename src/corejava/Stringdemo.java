package corejava;

public class Stringdemo {

	public static void main(String[] args) {

		String s1 = "Java";

		String s2 = "Java";

		String s3 = new String("Java");

		String s4 = new String("Is the best programming language");

		// Comparing the content
		System.out.println(s1.equals(s2));

		System.out.println(s1.equals(s4));

		// Comparing the memory location
		System.out.println(s1 == s2);

		System.out.println(s2 == s4);

		System.out.println(s3 == s4);

		// Concanat
		System.out.println(s2.concat(s4));

		// toUppercase
		System.out.println(s1.toUpperCase());

		// Length
		int lenght = s4.length();

		System.out.println(lenght);

		// Replace
		System.out.println(s1.replace('J', 'P'));

		// Contains
		System.out.println(s2.contains("ava"));

	}

}
