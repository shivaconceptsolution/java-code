package com.kangaroo.basic;

public class VariableConstantExample {
	static int a=10; // global 
	static void fun()
	{
	           int b=200; //local static
	           System.out.println(b);
	}

	public static void main(String[] args) {
		System.out.println(VariableConstantExample.a);
		VariableConstantExample.fun();
		

	}

}
