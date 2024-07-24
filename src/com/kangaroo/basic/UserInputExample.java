package com.kangaroo.basic;

import java.util.Scanner;


public class UserInputExample {

	public static void main(String[] args)  {
		        int num=11;
		        boolean flag=false;
				if(num%3==0)
				{
				System.out.println("Divisible by 3");
				flag=true;
				}
				if(num%5==0)
				{
				System.out.println("Divisible by 5");
				flag=true;
				}
				if(num%9==0)
				{
				System.out.println("Divisible by 9");
				flag=true;
				}
				if(!flag)
				{
					System.out.println("not Divisible by any one");
				}
				
			
		
		
		
	}

}
