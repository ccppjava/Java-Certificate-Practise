package com.example.p2;

import com.example.p1.P1Class1;

public class P2Class1 extends P1Class1 {
	
	// public/protected is allowed here
	// default/private is not allowed
	@Override
	public void protectedMethod(){
		super.protectedMethod();
		System.out.println("P2Class1.protectedMethod");

		// cannot reference to protected method from its reference
		//new P1Class1().protectedMethod();
	}

	// this method is not visible in other package, not possible
	// to override
	//
	//@Override
	//void defaultMethod() {
	//	System.out.println("P2Class1.defaultMethod");
	//}
}
