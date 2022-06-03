package com.cg.demo.pc1;

public class Demo1 {
	
	public static int publicField = 10;
	protected static int protectedField = 20;
	static int packageField = 30;
	private static int privateField = 40;
	
	public static void main(String[]args) {
		System.out.println(Demo1.publicField);
		System.out.println(Demo1.protectedField);
		System.out.println(Demo1.packageField);
		System.out.println(Demo1.privateField);
	}

}
