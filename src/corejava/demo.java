package corejava;

import java.util.LinkedHashSet;
import java.util.Set;

public class demo {
	public static void main(String[] args) {
		Set<Integer> lt = new LinkedHashSet<>();

		lt.add(2);
		lt.add(5);
		lt.add(1);
		System.out.println(lt);
	}

}
