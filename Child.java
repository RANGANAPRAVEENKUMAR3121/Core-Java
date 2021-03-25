package com.kumar.interfaces;

public class Child implements Parent,Parent2
{

	public static void main(String[] args) {

		Child child = new Child();
		child.display();
		//System.out.println(child.pi); //ambiguity rises

		System.out.println(child.a);
	}

	@Override
	public void display() {
	//	pi = 3.10f;  can't be override
		System.out.println(Parent2.pi);
		System.out.println(Parent.pi);
		System.out.println(Parent2.a);
		
	}
	//if methods are diff the Overloaded must be require
	@Override
	public void display(int a) {
		System.out.println(Parent2.a);
	}

}
