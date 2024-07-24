package com.kangaroo.basic;

public class DynamicVariableExample {
    int x=10; //global non-static
    void fun()
    {
    	int y=20; //local non-static
    	System.out.println(y);
    }
	public static void main(String[] args) {
		DynamicVariableExample obj = new DynamicVariableExample();
		System.out.println(obj.x);
		obj.fun();

	}

}
