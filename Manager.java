package com.Kumar.Inheritance;

public class Manager extends Employee {

	String[] projects;
	double salary;//child class varaible gets high priority than parent class[shadowing]

	
	public Manager( int id, String name, String description, double salary,String[] projects,double mgsalary) {
		super(id,name,description,salary);
		System.out.println("Inside Manager Constructor");
		this.projects=projects;
		this.salary=mgsalary;//shadowing having same variable on parent and child
	}
	
	//@Override
	protected void work() {
		super.work();
		System.out.println("Employee Salary : "+super.salary);//Employee Salary
		System.out.println("Manager is Managing");
		for (int i=0;i<projects.length;i++) {
			System.out.println(projects[i]);
		}
		
	}
}
