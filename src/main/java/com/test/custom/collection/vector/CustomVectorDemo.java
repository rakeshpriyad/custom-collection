package com.test.custom.collection.vector;

public class CustomVectorDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1L, "RR1", "A1");
		Student s2 = new Student(2L, "RR2", "A2");
		Student s3 = new Student(3L, "RR3", "A3");
		Student s4 = new Student(4L, "RR4", "A4");
		Student s5 = new Student(5L, "RR5", "A5");
		VectorCustom<Student> students = new VectorCustom<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		students.display();

		Student s = students.get(1);
		System.out.println("studnet :" + s);
		students.remove(1);
		students.display();
	}

}
