package com.example;

import com.example.p1.P1Class1;
import com.example.p1.P1Class2;
import com.example.p2.P2Class1;
import com.example.p2.P2Class2;

public class P1P2Test {
	public static void main(String[] args) {
		System.out.println("test starts");

		P2Class2 p2Class2 = new P2Class2();
		p2Class2.testReference();
		
		P1Class2 p1Class2 = new P1Class2();
		p1Class2.defaultMethod();

	}
}
