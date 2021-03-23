package com.Kumar.Inheritance;

public class Developer extends Employee {

	String technology;

	
	public Developer( int id, String name, String description, double salary,String technology) {
		super(id,name,description,salary);
		System.out.println("Inside Developer Constructor");
		this.technology = technology;
	}
	
	protected void work() {
		super.work();
		System.out.println("Developer is Developing on :"+technology);
	}
	
}
