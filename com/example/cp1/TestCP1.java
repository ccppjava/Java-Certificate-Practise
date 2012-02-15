package com.example.cp1;

public class TestCP1 {
	// there is no equal sign between Days and curly bracket
	public enum Days {MON, TUE, WED};

	// static main method only reference to static field directly
	static Days day;

	Days anotherDay;

	public static void main(String[] args) {
		// only modifiers that apply to local variable is final
		// static Days day;
		System.out.println(day.MON);

		// it can be used this way, enum reference can specify
		// the class's "static final field"
		System.out.println(new TestCP1().anotherDay.MON);

		// enum is special one, the final static field is same 
		// type of the enum, which allows following
		Days yetAnotherDay = day.TUE;
		System.out.println(yetAnotherDay.MON);

		// follows will give error, as 12345 is too big
		// byte b = 12345;
		byte b = 123;
		// this compiles
		long l = 123;
		float f = 1;
		// this one will not compile as 1.1 is consider double
		// by default
		// float f = 1.1;
		float f2 = 1.1f;
	}
}
