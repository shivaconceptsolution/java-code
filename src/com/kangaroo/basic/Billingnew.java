package com.kangaroo.basic;

public class Billingnew extends Billing {
	
	 void calculateBill(String itemname, int qty, double price)
	    {
	    	bill = price*qty;
	    	double gst = bill*0.18F;
	    	bill = bill+gst;
	    	this.itemname=itemname;
	    	
	    	
	    }

}
