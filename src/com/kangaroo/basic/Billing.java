package com.kangaroo.basic;

public class Billing {
	double bill;
	String itemname;
    void calculateBill(String itemname, int qty, double price)
    {
    	bill = price*qty;
    	this.itemname=itemname;
    	
    	
    }
    
    void displayBill()
    {
    	System.out.println("Itemname is "+itemname);
    	System.out.println("Total bill is "+bill);
    }
    
}
