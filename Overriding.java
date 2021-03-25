package com.kumar.overriding;

public class Overriding {

	public static void main(String[] args) {

		Parent.dosomething();
		Child.dosomething();
		
		Parent p = new Parent();
		System.out.println(p.s);
		
		Child c = new Child();
		System.out.println(c.s);
		
		Parent pm = new Child(); //polymorphisam(parent obj hold child ref and access child methods)
		pm.method();
		
		Child pc = (Child)pm;  //obj binding [pm is parent obj assign to child obj]
		pm.method();
		
		Parent s = new Child();//reverse polymorphisam on variables(compiler loads variables during run time)
		System.out.println(s.s);
		
	}

}
