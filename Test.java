package com.Kumar.Inheritance;

public class Test {

	public static void main(String[] args) {
		String[] project = new String[] {"Manager","LeadRole"};
		Manager manager = new Manager(07,"Kumar","IT",60000,project/*new String[] {"Manager","Lead Role"}*/,300000);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.description);
		System.out.println(manager.salary);
		manager.work();
		
		Developer developer = new Developer(2,"Bharath","Developer",6000,"Full Stack Java Dev");
		developer.work();
		
	}

}
