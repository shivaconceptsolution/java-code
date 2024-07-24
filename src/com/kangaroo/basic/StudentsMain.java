package com.kangaroo.basic;
import java.util.Scanner;
public class StudentsMain {

	public static void main(String[] args) {
		/*Students obj = new Students();
		obj.acceptInfo(1,"stu1");
		obj.displayInfo();
		
		Students obj1 = new Students();
		obj1.acceptInfo(2,"stu2");
		obj1.displayInfo();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int size = sc.nextInt();
		Students obj[] = new Students[size];
		//int obj[] = new int[5]
		for(int i=0;i<obj.length;i++)
		{
		
			obj[i] = new Students();
			System.out.println("Enter rno");
			int rno = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			obj[i].acceptInfo(rno,name);
		}
		 System.out.println("Student Information");
		 for(int i=0;i<obj.length;i++)
		 {
			obj[i].displayInfo();
		 }

	}

}
