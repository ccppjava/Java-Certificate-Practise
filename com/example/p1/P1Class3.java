package com.example.p1;

import com.example.p2.*;

public class P1Class3 {
	public void testAccess() {
		System.out.println("P1Class3.testAccess starts:");
		P2Class1 p2Class1 = new P2Class1();
		// you cannot access the method directly, due to the fact
		// that protected is package and child access
		//
		// p2Class1.protectedMethod();
		
		P1Class1 p1Class1ToP2Class1 = p2Class1;
		p1Class1ToP2Class1.protectedMethod();

		System.out.println("when it is not override in sub-class:");
		P2Class3 p2Class3 = new P2Class3();
		// interesting, it will allow you to call the protected
		// method like this, compiler seems to know that the 
		// method is actually called from P1Class1
		p2Class3.protectedMethod();
	}
}
