package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

	public static void main(String[] args) {
		Polymorphism obj =new Polymorphism();
				obj.annualIncomeVoid();
		
		
		car(4, "bmw");
		
	}
		public void annualIncomeVoid(){
			int calculateAnnualIncome = hourlyIncome * 2000;
					int Bonus = 20000;
					int RentIncome = 1000;
					int SideIncome = 20000;
					int newIncome = calculateAnnualIncome+Bonus+RentIncome+SideIncome;
					System.out.println("My Annual Income =" + newIncome);
					
		}
	
		public static void car(){
			System.out.print("My car is Audi !");

	}

public static void car(int door){
System.out.print("My car is Audi, it has door: "+ door);
}


public static void car(String color){
	System.out.println("My car is Audi !,it has color: "+color);
}

public static void car(int wheel, String brand){
	System.out.println("My car is "+ brand + "  !, it has wheel: "+ wheel);
}
}

