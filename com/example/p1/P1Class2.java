package com.example.p1;

public class P1Class2 extends P1Class1 {
	// note: you are not allow to use private as access modifier
	// as you not suppose to assign weaker access privileges
	// default/protected/default is allowed
	@Override
	public void defaultMethod() {
		super.defaultMethod();
		System.out.println("P1Class2.defaultMethod");
	}
}
