package com.kangaroo.basic;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.next().charAt(0);
		switch(num%2) {
		case 0:
		System.out.println("Even");
		break;
		default:
		System.out.println("Odd");
		break;
		}

	}

}
