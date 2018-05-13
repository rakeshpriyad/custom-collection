package com.test.collection.custom.impl.hashmap;

public class CustomHashMapDemo {

	public static void main(String[] args) {

		CustomHashMap<Employee, Integer> hashMapCustom = new CustomHashMap<Employee, Integer>();
		hashMapCustom.put(new Employee("10", "XX"), 12);
		hashMapCustom.put(new Employee("21", "YY"), 121);
		hashMapCustom.put(new Employee("31", "RR"), 151);
		hashMapCustom.put(new Employee("43", "RR"), 15);
		hashMapCustom.put(new Employee("42", "TT"), 89);

		System.out.println("Display values corresponding to keys>");
		System.out.println("value corresponding to employee with id=21 & name='amy' : "
				+ hashMapCustom.get(new Employee("21", "amy")));
		System.out.println("value corresponding to employee with id=51 & name='pat' : "
				+ hashMapCustom.get(new Employee("51", "pat")));

		System.out.print("Displaying : ");
		hashMapCustom.display();

		System.out.println("\n\nvalue corresponding to employee with id=21 & name='amy' removed: "
				+ hashMapCustom.remove(new Employee("21", "amy")));
		System.out.println("value corresponding to employee with id=51 & name='pat' removed: "
				+ hashMapCustom.remove(new Employee("51", "pat")));

		System.out.print("Displaying : ");
		hashMapCustom.display();

	}
}