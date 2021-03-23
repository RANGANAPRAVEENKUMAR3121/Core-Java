package com.Kumar.Inheritance;

public class Tester extends Employee {

	String[] tools;

	
	public Tester( int id, String name, String description, double salary,String[] tools) {
		super(id,name,description,salary);
		this.tools = tools;
	}
	
	protected void work() {
		System.out.println("Tester is Testing on : ");
		for(int i=0;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
	}
	
}
