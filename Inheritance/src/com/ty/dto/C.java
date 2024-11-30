package com.ty.dto;

public class C extends B{

	public static void main(String[] args) {
		
		A a = new A();
		a.main();
		B b = (B)a;
		b.m1();

	}

}
