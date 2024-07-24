package com.kangaroo.basic;
import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		
		String x = "hello";
		String x1 = x.concat("world");
		String x2 = "hello";
		String x3 = new String("hello");
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x==x2);
		System.out.println(x==x3);
		System.out.println(x2==x3);

}

}
