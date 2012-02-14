package com.example.p2;

public class P2Class2 {
	public void testReference() {
		P2Class1 p2Class1 = new P2Class1();
		System.out.println("Calling protected method from same package.");
		p2Class1.protectedMethod();

		P2Class3 p2Class3 = new P2Class3();
		//
		// we cannot do follows, as the protected is not accessible
		// from other package (if not by parent/child relationship)
		// even through a class from same package which inherited it
		// 
		// unless like P2Class1, which has override it to be (public/protected)
		//
		// p2Class3.protectedMethod();
	}
}
