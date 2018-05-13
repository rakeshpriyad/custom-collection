package com.test.collection.custom.impl.hashset;

public class CustomHashSetDemo {

	public static void main(String[] args) {
		CustomHashSet<Integer> CustomHashSet = new CustomHashSet<Integer>();
		CustomHashSet.add(21);
		CustomHashSet.add(25);
		CustomHashSet.add(30);
		CustomHashSet.add(33);
		CustomHashSet.add(35);

		System.out.println("CustomHashSet contains 21 =" + CustomHashSet.contains(21));
		System.out.println("CustomHashSet contains 51 =" + CustomHashSet.contains(51));

		System.out.print("Displaying CustomHashSet: ");
		CustomHashSet.display();

		System.out.println("\n\n21 removed: " + CustomHashSet.remove(21));
		System.out.println("22 removed: " + CustomHashSet.remove(22));

		System.out.print("Displaying CustomHashSet: ");
		CustomHashSet.display();

	}
}