package com.kangaroo.basic;

public class OverloadExample {

	void add(int a,int b)
	{
		 System.out.println(a+b);
	}
	 void add(Integer a,Integer b)
	{
		 System.out.println(a+b-2);
	}
	void add(float a,float b)
	{
			 System.out.println(a+b-1);
	}
    void add(double a,double b)
	{
       System.out.println(a+b);
	}
	public static void main(String[] args) {
		
       OverloadExample obj = new OverloadExample();
       obj.add(12.345,12.345);
       obj.add(12.345F,12.345F);
       obj.add(10,2);
       Integer x=1;
       Integer y=2;
       obj.add(x, y);
       
       
	}

}
