package com.kangaroo.basic;

public class Customer {

	public static void main(String[] args) {
		Billing obj = new Billing();   //not overrding
		obj.calculateBill("mouse",5,150);
		obj.displayBill();
		
		Billingnew obj1 = new Billingnew(); // partial overriding
		obj1.calculateBill("mouse",5,150);
		obj1.displayBill();
		Billing obj2 = new Billingnew();   //actual overriding 
		obj2.calculateBill("mouse",5,150);
		obj2.displayBill();


	}

}
