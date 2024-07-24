package com.kangaroo.basic;

public class Car extends Vehicle{
   Engine obj= new Engine(); //Composition
   void displayCar(String brand)
   {
	   obj.EngineInfo("petrol",1099);
	   System.out.println("Brand is "+brand);
   }
}
