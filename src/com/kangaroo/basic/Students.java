package com.kangaroo.basic;

public class Students {
private int rno;
private String sname;
void acceptInfo(int rno1, String sname1)
{
	this.rno=rno1;
	this.sname=sname1;
}
void displayInfo()
{
	System.out.println("rno is "+rno);
	System.out.println("sname is "+sname);
}
}
