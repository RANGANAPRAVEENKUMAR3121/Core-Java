package com.Kumar.Inheritance;

public class Employee {

	int id;
	String name;
	String description;
	double salary;
	
	public Employee( int id, String name, String description, double salary) {
		System.out.println("Inside Employee Constructor");
		this.id = id;
		this.name = name;
		this.description = description;
		this.salary = salary;
	}
	//protected final void work()  , if we apply final then we can't override
	protected void work() {
		System.out.println("Common Work for EveryOne.");
	}
}
