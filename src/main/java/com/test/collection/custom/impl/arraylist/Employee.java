package com.test.collection.custom.impl.arraylist;

class Employee {
	private String id;
	private String name;

	/**
	 * Employee constructor
	 */
	public Employee(String id, String name) { // constructor
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + name + "] ";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
