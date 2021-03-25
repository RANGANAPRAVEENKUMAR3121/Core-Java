package com.kumar.overriding;

public class Child extends Parent {
	
	String s = "Pravin";
	
	public static void dosomething() {
		//super.dosomething();//Parent method
		System.out.println("Child Class");
	}
	
	public void method() {
		System.out.println("Child");
	}

}
